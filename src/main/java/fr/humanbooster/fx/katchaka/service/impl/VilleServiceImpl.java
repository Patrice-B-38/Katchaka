package fr.humanbooster.fx.katchaka.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import fr.humanbooster.fx.katchaka.business.Ville;
import fr.humanbooster.fx.katchaka.dao.VilleDao;
import fr.humanbooster.fx.katchaka.service.VilleService;

@Service
public class VilleServiceImpl implements VilleService {
	
	private final VilleDao villeDao;
	
	public VilleServiceImpl(VilleDao villeDao) {
		super();
		this.villeDao = villeDao;
	}

	@Override
	public Ville ajouterVille(String nom) {		
		return villeDao.save(new Ville(nom));
	}

	@Override
	public Ville recupererVille(String nom) {
		
		return villeDao.findByNom(nom);
	}

	@Override
	public List<Ville> recupererVilles() {		
		return villeDao.findAll();
	}

}
