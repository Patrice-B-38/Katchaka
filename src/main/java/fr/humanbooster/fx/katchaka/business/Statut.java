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
@Table(name="statut")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Statut {


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    /**
     * 
     */
    private String nom;
    
    
    @OneToMany(mappedBy = "statut")
    private List<Personne> personnes;

    public Statut(String nom) {
    	this.nom = nom;
    }

}