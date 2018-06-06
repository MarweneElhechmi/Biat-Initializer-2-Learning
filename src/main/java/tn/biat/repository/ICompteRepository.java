package tn.biat.repository;

import java.util.List;


import tn.biat.domain.Compte;

public interface ICompteRepository{
	
	void create(Compte c);
	Compte findById(String Id);
	List<Compte> findAll();
	void update(Compte c);
	void delete(String Id);

}
