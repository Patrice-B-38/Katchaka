package fr.humanbooster.fx.katchaka.service;

import fr.humanbooster.fx.katchaka.business.Personne;

public interface PersonneService {

//	Personne ajouterPersonne(String pseudo, String motDePasse, String email, LocalDateTime dateDeNaissance, String bio,
//			int nbCredits, boolean estFumeur);

	//Personne ajouterPersonne(String pseudo, String email, String motDePasse);

	Personne ajouterPersonne(Personne personne);
	
	
	
	//Personne enregistrerPersonne(Personne personne);
}
