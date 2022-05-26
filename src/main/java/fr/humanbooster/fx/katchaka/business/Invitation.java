package fr.humanbooster.fx.katchaka.business;

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="invitation")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Invitation {
   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    /**
     * 
     */
    private Date dateEnvoi;

    /**
     * 
     */
    private Date dateLecture;

    /**
     * 
     */
    private boolean estAccepte;

    @OneToOne
    private VieCommune vieCommune;

    @ManyToOne
    private Personne destinataire;

    @ManyToOne
    private Personne expediteur;
    
//    @ManyToOne
//    private Personne personne;
    
    public Invitation(Date dateEnvoi, Date dateLecture, boolean estAccepte) {
    	this.dateEnvoi = dateEnvoi;
    	this.dateLecture = dateLecture;
    	this.estAccepte = estAccepte;
    }

}