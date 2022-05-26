package fr.humanbooster.fx.katchaka.service;

import java.util.Date;

import fr.humanbooster.fx.katchaka.business.VieCommune;

public interface VieCommuneService {
	
	VieCommune ajouterVieCommune(Date dateDebut, Date dateFin,int nbCredits);

}
