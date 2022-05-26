package fr.humanbooster.fx.katchaka.service.impl;

import java.util.Date;

import org.springframework.stereotype.Service;

import fr.humanbooster.fx.katchaka.business.Message;
import fr.humanbooster.fx.katchaka.dao.MessageDao;
import fr.humanbooster.fx.katchaka.service.MessageService;

@Service
public class MessageServiceImpl implements MessageService {
	
	public final MessageDao messageDao;
	
	public MessageServiceImpl(MessageDao messageDao) {
		super();
		this.messageDao = messageDao;
	}

	@Override
	public Message ajouterMessage(String contenu, Date dateEnvoi, Date dateLecture) {		
		return messageDao.save(new Message(contenu, dateEnvoi, dateLecture));
	}

}
