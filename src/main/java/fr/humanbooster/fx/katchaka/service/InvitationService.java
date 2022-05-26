package fr.humanbooster.fx.katchaka.service;

import java.util.Date;

import fr.humanbooster.fx.katchaka.business.Invitation;

public interface InvitationService {
	
	Invitation ajouterInvitation(Date dateEnvoi, Date dateLecture, boolean estAccepte);

}
