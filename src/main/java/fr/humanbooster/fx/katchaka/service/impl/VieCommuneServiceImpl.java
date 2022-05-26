package fr.humanbooster.fx.katchaka.service.impl;

import java.util.Date;

import org.springframework.stereotype.Service;

import fr.humanbooster.fx.katchaka.business.VieCommune;
import fr.humanbooster.fx.katchaka.dao.VieCommuneDao;
import fr.humanbooster.fx.katchaka.service.VieCommuneService;

@Service
public class VieCommuneServiceImpl implements VieCommuneService {
	
	private final VieCommuneDao vieCommuneDao;
	
	public VieCommuneServiceImpl(VieCommuneDao vieCommuneDao) {
		super();
		this.vieCommuneDao = vieCommuneDao;
	}

	@Override
	public VieCommune ajouterVieCommune(Date dateDebut, Date dateFin, int nbCredits) {		
		return vieCommuneDao.save(new VieCommune(dateDebut, dateFin, nbCredits));
	}

}
