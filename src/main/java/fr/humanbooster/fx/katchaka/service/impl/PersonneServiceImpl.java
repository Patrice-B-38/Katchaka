package fr.humanbooster.fx.katchaka.service.impl;

import org.springframework.stereotype.Service;

import fr.humanbooster.fx.katchaka.business.Personne;
import fr.humanbooster.fx.katchaka.dao.PersonneDao;
import fr.humanbooster.fx.katchaka.service.PersonneService;

@Service
public class PersonneServiceImpl implements PersonneService {

	private final PersonneDao personneDao;

	public PersonneServiceImpl(PersonneDao personneDao) {
		super();
		this.personneDao = personneDao;
	}
	
	@Override
	public Personne ajouterPersonne(Personne personne) {
		return personneDao.save(personne);
	}
	
	

//	@Override
//	public Personne enregistrerPersonne(Personne personne) {
//		return personneDao.save(new Personne(personne));
//	}

//	@Override
//	public Personne ajouterPersonne(String pseudo, String motDePasse, String email, String dateDeNaissance, String bio,
//			int nbCredits, boolean estFumeur) {
//		// TODO Auto-generated method stub
//		return null;
//	}

//	@Override
//	public Personne ajouterPersonne(String pseudo, String motDePasse, String email, String dateDeNaissance,
//			String bio, int nbCredits, boolean estFumeur) {
//		return personneDao.save(new Personne(pseudo, motDePasse, email, dateDeNaissance, bio, nbCredits, estFumeur));
//	}

}
