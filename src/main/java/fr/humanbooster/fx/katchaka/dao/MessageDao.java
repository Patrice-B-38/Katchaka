package fr.humanbooster.fx.katchaka.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.humanbooster.fx.katchaka.business.Message;

public interface MessageDao extends JpaRepository<Message, Long> {

}
