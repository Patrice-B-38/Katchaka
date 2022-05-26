package fr.humanbooster.fx.katchaka.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.humanbooster.fx.katchaka.business.Ville;

public interface VilleDao extends JpaRepository<Ville, Long>{

	Ville findByNom(String nom);

}
