package org.nioun.essentials.fournisseur.service;

import java.util.List;

import org.nioun.essentials.fournisseur.model.Fournisseur;
import org.nioun.essentials.fournisseur.repository.FournisseurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FournisseurServiceImpl implements FournisseurService {

	@Autowired
	FournisseurRepository fournisseurRepository;
	
	
	
	public FournisseurRepository getFournisseurRepository() {
		return fournisseurRepository;
	}

	public void setFournisseurRepository(FournisseurRepository fournisseurRepository) {
		this.fournisseurRepository = fournisseurRepository;
	}


	public Fournisseur saveFournisseur(Fournisseur fournisseur) {

		return fournisseurRepository.save(fournisseur);
	}


	public Fournisseur updateFournisseur(Fournisseur fournisseur) {

		return fournisseurRepository.save(fournisseur);
	}

	
	public void deleteFournisseur(Fournisseur fournisseur) {
	
		fournisseurRepository.delete(fournisseur);

	}


	public Fournisseur getFournisseur(Long id) {

		return fournisseurRepository.getById(id);
	}


	public List<Fournisseur> getAllFournisseurs() {

		return fournisseurRepository.findAll();
	}

}
