package fr.humanbooster.fx.katchaka.service;

import java.util.Date;

import fr.humanbooster.fx.katchaka.business.Message;

public interface MessageService {
	
	Message ajouterMessage(String contenu, Date dateEnvoi, Date dateLecture);

}
