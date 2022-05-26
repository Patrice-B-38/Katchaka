package fr.humanbooster.fx.katchaka.business;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="interet")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Interet {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    /**
     * 
     */
    private String nom;

    @ManyToMany(mappedBy = "interets")
    private List<Personne> personnes;
    
    public Interet(String nom) {
    	this.nom = nom;
    }

}