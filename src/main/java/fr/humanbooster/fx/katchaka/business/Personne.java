package fr.humanbooster.fx.katchaka.business;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "personne")
//@NoArgsConstructor
@Getter
@Setter
public class Personne {


	private static int NB_CREDIT_INITIAL = 500;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	/**
	 * 
	 */
	private String pseudo;

	/**
	 * 
	 */
	private String motDePasse;

	@Email
	private String email;

	/*	*
	 * 
	 */
	private LocalDateTime dateDeNaissance;

	/**
	 * 
	 */
	private String bio;

	/**
	 * 
	 */
	public int nbCredits;

	/**
	 * 
	 */
	private boolean estFumeur;

	// private boolean estExpediteur;

	@OneToMany(mappedBy = "expediteur")
	private List<Message> messagesEnvoyes;

	@OneToMany(mappedBy = "destinataire")
	private List<Message> messagesRecus;

	//@NotNull(message = "Merci de choisir une ville")
	@ManyToOne
	private Ville ville;

	@ManyToMany
	private List<Interet> interets;

	//@NotNull(message = "Merci de choisir un genre recherché")
	@ManyToOne
	private Genre genreRecherche;

	//@NotNull(message = "Merci de choisir un genre")
	@ManyToOne
	private Genre genre;

	@ManyToOne
	//@NotNull(message = "Merci de choisir un statut")
	private Statut statut;

	@OneToMany(mappedBy = "destinataire")
	private List<Invitation> invitationsRecues;

	@OneToMany(mappedBy = "expediteur")
	private List<Invitation> invitationsEnvoyees;
	
	public Personne() {
		nbCredits = NB_CREDIT_INITIAL;
		//dateHeureInscription = LocalDateTime.now();
		System.out.println("--personne---");
	}

	public Personne(Personne personne) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Personne [id=" + id + ", pseudo=" + pseudo + ", motDePasse=" + motDePasse + ", email=" + email
				+ ", dateDeNaissance=" + dateDeNaissance + ", bio=" + bio + ", nbCredits=" + nbCredits + ", estFumeur="
				+ estFumeur + ", messagesEnvoyes=" + messagesEnvoyes + ", messagesRecus=" + messagesRecus + ", ville="
				+ ville + ", interets=" + interets + ", genreRecherche=" + genreRecherche + ", genre=" + genre
				+ ", statut=" + statut + ", invitationsRecues=" + invitationsRecues + ", invitationsEnvoyees="
				+ invitationsEnvoyees + "]";
	}
	
//	public Personne(String pseudo, String motDePasse, String email, 
//			String dateDeNaissance, String bio, int nbCredits, boolean estFumeur) {
//		this.pseudo = pseudo;
//		this.motDePasse = motDePasse;
//		this.email = email;
//		this.dateDeNaissance = dateDeNaissance;
//		this.bio = bio;
//		this.nbCredits = nbCredits;
//		this.estFumeur = estFumeur;
//	}
	
//	public Personne(String pseudo, String email, String motDePasse) {
//		this.pseudo = pseudo;		
//		this.email = email;
//		this.motDePasse = motDePasse;
//	}
	
//	public Personne() {
//		this.pseudo = pseudo;		
//		this.email = email;
//		this.motDePasse = motDePasse;
//	}
	
	

}