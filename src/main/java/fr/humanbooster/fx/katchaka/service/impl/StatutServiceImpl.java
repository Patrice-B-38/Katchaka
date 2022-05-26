package fr.humanbooster.fx.katchaka.service.impl;


import java.util.List;

import org.springframework.stereotype.Service;

import fr.humanbooster.fx.katchaka.business.Statut;
import fr.humanbooster.fx.katchaka.dao.StatutDao;
import fr.humanbooster.fx.katchaka.service.StatutService;

@Service // Spring va déduire que cette classe est un service
public class StatutServiceImpl implements StatutService {
	
	private final StatutDao statutDao;
	
	public StatutServiceImpl(StatutDao statutDao) {
		super();
		this.statutDao = statutDao;
	}
	
	@Override
	public Statut ajouterStatut(String nom) {
		return statutDao.save(new Statut(nom));
	}

	@Override
	public Statut recupererStatut(String nom) {		
		return statutDao.findByNom(nom);
	}

	@Override
	public List<Statut> recupererStatuts() {	
		return statutDao.findAll();
	}

}
