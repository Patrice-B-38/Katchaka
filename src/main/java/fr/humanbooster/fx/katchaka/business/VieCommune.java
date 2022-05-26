package fr.humanbooster.fx.katchaka.business;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "vieCommune")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class VieCommune {

	private static int NB_CREDITS_PAR_DEFAUT;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	/**
	 * 
	 */
	private Date dateDebut;

	/**
	 * 
	 */
	private Date dateFin;

	/**
	 * 
	 */
	private int nbCredits;

	@OneToMany(mappedBy = "vieCommune")
	private List<Message> messages;

	@OneToOne
	private Invitation invitation;
	
	public VieCommune(Date dateDebut, Date dateFin,int nbCredits) {
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.nbCredits = nbCredits;
	}

}