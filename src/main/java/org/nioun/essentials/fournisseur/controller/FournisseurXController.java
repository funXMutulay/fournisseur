package org.nioun.essentials.fournisseur.controller;

import java.util.List;

import org.nioun.essentials.fournisseur.model.Fournisseur;
import org.nioun.essentials.fournisseur.repository.FournisseurRepository;
import org.nioun.essentials.fournisseur.service.FournisseurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FournisseurXController {
	@Autowired
	FournisseurService service;

	@Autowired
	FournisseurRepository repository;



	@RequestMapping("/creerFournisseur")
	public String creerFournisseur(ModelMap map) {
		Fournisseur fournisseur= new Fournisseur();
		map.addAttribute(fournisseur);
		return "ajouterFournisseur";
	}

	@RequestMapping("/saveFournisseur")
	public String saveFournisseur(@ModelAttribute("fournisseur") Fournisseur fournisseur, ModelMap modelMap) {
		Fournisseur fournisseurSaved = service.saveFournisseur(fournisseur);
		String msg = "Fournisseur saved with id: " + fournisseurSaved.getFournisseurId();
		modelMap.addAttribute("msg", msg);
		/* emailUtil.sendEmail("mmdukb@hotmail.com", "Fournisseur Saved",
				"Fournisseur Saved Successfully and about to return a response");
*/
		return "ajouterFournisseur";
	}

	@RequestMapping("/displayFournisseurs")
	public String displayFournisseurs(ModelMap modelMap) {
		List<Fournisseur> fournisseurs = service.getAllFournisseurs();
		modelMap.addAttribute("fournisseurs", fournisseurs);
		return "displayFournisseurs";
	}

	@RequestMapping("deleteFournisseur")
	public String deleteFournisseur(@RequestParam("fournisseurId") Long fournisseurId, ModelMap modelMap) {
		 // Fournisseur Fournisseur = service.getFournisseur(FournisseurId);
		Fournisseur fournisseur = new Fournisseur();
		fournisseur.setFournisseurId(fournisseurId);
		service.deleteFournisseur(fournisseur);
		List<Fournisseur> fournisseurs = service.getAllFournisseurs();
		modelMap.addAttribute("fournisseurs", fournisseurs);
		return "displayFournisseurs";
	}

	@RequestMapping("/showUpdate")
	public String showUpdate(@RequestParam("fournisseurId") Long fournisseurId, ModelMap modelMap) {
		Fournisseur fournisseur = service.getFournisseur(fournisseurId);
		modelMap.addAttribute("fournisseur", fournisseur);
		return "updateFournisseur";
	}

	@RequestMapping("/updateFournisseur")
	public String updateFournisseur(@ModelAttribute("fournisseur") Fournisseur fournisseur, ModelMap modelMap) {
		service.updateFournisseur(fournisseur);
		List<Fournisseur> fournisseurs = service.getAllFournisseurs();
		modelMap.addAttribute("fournisseurs", fournisseurs);
		return "afficherFournisseurs";
	}


}
