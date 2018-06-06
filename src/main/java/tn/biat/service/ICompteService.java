package tn.biat.service;

import java.math.BigDecimal;
import java.util.List;

import tn.biat.domain.Compte;

public interface ICompteService {
	
	void ouvrirCompte(Compte c);
	BigDecimal consulterSolde(String numCompte);
	List<Compte> toutLesComptesEnRouge();

}
