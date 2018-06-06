package tn.biat.repository;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import tn.biat.domain.Compte;

@Repository
public class CompteRepositoryImpl implements ICompteRepository{
	private static List<Compte>comptes = Arrays.asList(
			new Compte("C100","Marwene",new BigDecimal("100")),
			new Compte("E100","Marwene",new BigDecimal("200")),
			new Compte("E200","Marwene",new BigDecimal("300")) 
			);
	@Override
	public void create(Compte c) {
		comptes.add(c);
	}
	@Override
	public Compte findById(String Id) {
		return comptes.stream().filter(c-> c.getNumero().equals(Id)).findFirst().orElse(null);
	}
	@Override
	public List<Compte> findAll(){
		return comptes;
	}
	@Override
	public void update(Compte c) {
		comptes.remove(findById(c.getNumero()));
		comptes.add(c);
	}
	@Override
	public void delete(String Id) {
		comptes.remove(Id);
	}

}
