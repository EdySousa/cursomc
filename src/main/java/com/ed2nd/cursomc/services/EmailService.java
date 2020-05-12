package com.ed2nd.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.ed2nd.cursomc.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);
	void sendEmail(SimpleMailMessage msg);

}


