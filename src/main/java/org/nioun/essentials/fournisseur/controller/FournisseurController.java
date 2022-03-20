package org.nioun.essentials.fournisseur.controller;

import org.nioun.essentials.fournisseur.model.Fournisseur;
import org.nioun.essentials.fournisseur.repository.FournisseurRepository;
import org.nioun.essentials.fournisseur.service.FournisseurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FournisseurController {

	@Autowired
	FournisseurRepository fournisseurRepository ;
	
	@Autowired
	FournisseurService fournisseurService;

@GetMapping("/fournisseur/firstName/{firstName}/lastName/{lastName}")
public  Fournisseur	getFournisseur(@PathVariable String firstName , @PathVariable String lastName){
	 
	Fournisseur fournisseur = fournisseurRepository.findByFirstNameAndLastName(firstName, lastName);
	
	if (fournisseur==null){
		
		throw new RuntimeException("Impossible de trouver le fournisseuraunom de  "+firstName+lastName);
	}
	
	return  fournisseur;
	}

@GetMapping("/fournisseur/fournisseurId/{fournisseurId}")
public Fournisseur getFournisseurById(@PathVariable Long fournisseurId) {
	
	Fournisseur fournisseur = fournisseurService.getFournisseur(fournisseurId);
	return fournisseur;
}
	
}
