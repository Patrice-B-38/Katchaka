package fr.humanbooster.fx.katchaka.business;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "genre")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Genre {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	/**
	 * 
	 */
	private String nom;

	@OneToMany(mappedBy = "genre")
	private List<Personne> personnes;

	@OneToMany(mappedBy = "genreRecherche")
	private List<Personne> personnesRecherchant;
	
	public Genre(String nom) {
		this.nom = nom;
	}

}