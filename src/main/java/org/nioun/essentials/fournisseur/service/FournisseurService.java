package org.nioun.essentials.fournisseur.service;

import java.util.List;

import org.nioun.essentials.fournisseur.model.Fournisseur;

public interface FournisseurService {

	Fournisseur saveFournisseur(Fournisseur fournisseur);
	
	Fournisseur updateFournisseur(Fournisseur fournisseur);
	
	void deleteFournisseur(Fournisseur fournisseur);
	
	Fournisseur getFournisseur(Long id);
	
	List<Fournisseur> getAllFournisseurs();
	
}
