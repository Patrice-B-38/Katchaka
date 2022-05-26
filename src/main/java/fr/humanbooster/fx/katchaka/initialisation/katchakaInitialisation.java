package fr.humanbooster.fx.katchaka.initialisation;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import fr.humanbooster.fx.katchaka.business.Genre;
import fr.humanbooster.fx.katchaka.business.Interet;
import fr.humanbooster.fx.katchaka.business.Personne;
import fr.humanbooster.fx.katchaka.business.Statut;
import fr.humanbooster.fx.katchaka.business.Ville;
import fr.humanbooster.fx.katchaka.dao.GenreDao;
import fr.humanbooster.fx.katchaka.dao.InteretDao;
import fr.humanbooster.fx.katchaka.dao.PersonneDao;
import fr.humanbooster.fx.katchaka.dao.StatutDao;
import fr.humanbooster.fx.katchaka.dao.VilleDao;
import fr.humanbooster.fx.katchaka.service.GenreService;
import fr.humanbooster.fx.katchaka.service.InteretService;
import fr.humanbooster.fx.katchaka.service.PersonneService;
import fr.humanbooster.fx.katchaka.service.StatutService;
import fr.humanbooster.fx.katchaka.service.VilleService;
import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class katchakaInitialisation implements CommandLineRunner {

	private final StatutDao statutDao;
	private final GenreDao genreDao;
	private final InteretDao interetDao;
	private final VilleDao villeDao;
	private final PersonneDao personneDao;

	private final GenreService genreService;
	private final VilleService villeService;
	private final StatutService statutService;
	private final InteretService interetService;
	private final PersonneService personneService;

	// private static SimpleDateFormat simpleDateFormat = new
	// SimpleDateFormat("yyyy-MM-dd");

//	private static Random random = new Random();
//	private static FakeValuesService fakeValuesService = new FakeValuesService(new Locale("fr-FR"),
//			new RandomService());
//	private static Faker faker = new Faker(new Locale("fr-FR"));

	@Override
	public void run(String... args) throws Exception {
		ajouterStatuts();
		ajouterGenres();
		ajouterInterets();
		ajouterVilles();
		ajouterPersonnes();
	}

	private void ajouterVilles() {
		if (villeDao.count() == 0) {
			villeDao.save(new Ville("Lyon"));
			villeDao.save(new Ville("Grenoble"));
			villeDao.save(new Ville("Paris"));
			villeDao.save(new Ville("Marseille"));
		}
	}

	private void ajouterInterets() {
		if (interetDao.count() == 0) {
			interetDao.save(new Interet("Cinéma"));
			interetDao.save(new Interet("Ballades"));
			interetDao.save(new Interet("Randonnées"));
			interetDao.save(new Interet("Concerts"));
			interetDao.save(new Interet("Musique"));
			interetDao.save(new Interet("Restaurants"));
			interetDao.save(new Interet("Voyages"));
		}
	}

	private void ajouterGenres() {
		if (genreDao.count() == 0) {
			genreDao.save(new Genre("Homme"));
			genreDao.save(new Genre("Femme"));
		}
	}

	private void ajouterStatuts() {
		if (statutDao.count() == 0) {
			statutDao.save(new Statut("Célibataire"));
			statutDao.save(new Statut("Veuf"));
			statutDao.save(new Statut("Divorcé"));
			statutDao.save(new Statut("Séparé"));
		}
	}

	private void ajouterPersonnes() {
		if (personneDao.count() == 0) {
			Personne evan = new Personne();
			evan.setPseudo("Evan");
			try {
				evan.setDateDeNaissance(LocalDateTime.parse("1987-09-26"));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			evan.setGenre(genreService.recupererGenre("Homme"));
			evan.setGenreRecherche(genreService.recupererGenre("Femme"));
			evan.setVille(villeService.recupererVille("Grenoble"));
			evan.setStatut(statutService.recupererStatut("Célibataire"));
			List<Interet> interetsEvan = new ArrayList<>();
			interetsEvan.add(interetService.recupererInteret("Musique"));
			evan.setInterets(interetsEvan);
			personneService.ajouterPersonne(evan);

			Personne tomate = new Personne();
			tomate.setPseudo("Tomate");
			try {
				tomate.setDateDeNaissance(LocalDateTime.parse("1991-05-05"));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			tomate.setGenre(genreService.recupererGenre("Femme"));
			tomate.setGenreRecherche(genreService.recupererGenre("Homme"));
			tomate.setVille(villeService.recupererVille("Lyon"));
			tomate.setStatut(statutService.recupererStatut("Célibataire"));
			List<Interet> interetsTomate = new ArrayList<>();
			interetsTomate.add(interetService.recupererInteret("Voyages"));
			interetsTomate.add(interetService.recupererInteret("Concerts"));
			interetsTomate.add(interetService.recupererInteret("Randonnées"));
			tomate.setInterets(interetsTomate);
			personneService.ajouterPersonne(tomate);

			Personne joaquim = new Personne();
			joaquim.setPseudo("Joaquim");
			try {
				joaquim.setDateDeNaissance(LocalDateTime.parse("1980-01-01"));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			joaquim.setGenre(genreService.recupererGenre("Homme"));
			joaquim.setGenreRecherche(genreService.recupererGenre("Femme"));
			joaquim.setVille(villeService.recupererVille("Paris"));
			joaquim.setStatut(statutService.recupererStatut("Célibataire"));
			List<Interet> interetsJoaquim = new ArrayList<>();
			interetsJoaquim.add(interetService.recupererInteret("Cinéma"));
			interetsJoaquim.add(interetService.recupererInteret("Ballades"));
			joaquim.setInterets(interetsJoaquim);
			personneService.ajouterPersonne(joaquim);
		}
	}
}
