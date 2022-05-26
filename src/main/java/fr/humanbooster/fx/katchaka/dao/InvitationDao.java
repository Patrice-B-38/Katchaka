package fr.humanbooster.fx.katchaka.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.humanbooster.fx.katchaka.business.Invitation;

public interface InvitationDao extends JpaRepository<Invitation, Long> {

}
