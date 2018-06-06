package tn.biat.api;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import tn.biat.service.ICompteService;

@RestController
public class CompteRestController {

	@Autowired
	private ICompteService service;
	
	@GetMapping("/comptes/{id}")
	BigDecimal getSolde(@PathVariable String id) {
		return service.consulterSolde(id);
	}
	
}
