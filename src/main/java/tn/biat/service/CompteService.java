package tn.biat.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.biat.domain.Compte;
import tn.biat.repository.ICompteRepository;

@Service
public class CompteService implements ICompteService {

	@Autowired
	private ICompteRepository repo;
	public static final BigDecimal Taux = BigDecimal.TEN;
	
	@Override
	public void ouvrirCompte(Compte c) {
		// TODO Auto-generated method stub

	}

	@Override
	public BigDecimal consulterSolde(String numCompte) {
		Compte resultat = repo.findById(numCompte);
		//Simulons une régle métier qui stipule que les comptes commencant par E se voient augmenter leur solde 
		//Par Taux
		return (resultat.getNumero().startsWith("E") ? 
				resultat.getSolde().multiply(BigDecimal.ONE.add(Taux.divide(new BigDecimal("100")))) : 
				resultat.getSolde());
	}

	@Override
	public List<Compte> toutLesComptesEnRouge() {
		// TODO Auto-generated method stub
		return null;
	}

}
