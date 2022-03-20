package org.nioun.essentials.fournisseur.repository;import org.nioun.essentials.fournisseur.model.Fournisseur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FournisseurRepository extends JpaRepository<Fournisseur,Long> {

	Fournisseur findByFirstNameAndLastName(String firstName , String lastName);
	
}
