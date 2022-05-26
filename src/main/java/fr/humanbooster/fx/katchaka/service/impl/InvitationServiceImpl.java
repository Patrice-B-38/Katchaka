package fr.humanbooster.fx.katchaka.service.impl;

import java.util.Date;

import org.springframework.stereotype.Service;

import fr.humanbooster.fx.katchaka.business.Invitation;
import fr.humanbooster.fx.katchaka.dao.InvitationDao;
import fr.humanbooster.fx.katchaka.service.InvitationService;

@Service
public class InvitationServiceImpl implements InvitationService {
	
	private final InvitationDao invitationDao;
	
	public InvitationServiceImpl(InvitationDao invitationDao) {
		super();
		this.invitationDao = invitationDao;
	}

	@Override
	public Invitation ajouterInvitation(Date dateEnvoi, Date dateLecture, boolean estAccepte) {
		return invitationDao.save(new Invitation(dateEnvoi, dateLecture, estAccepte));
	}

}
