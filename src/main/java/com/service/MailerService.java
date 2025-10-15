package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailerService {

	@Autowired
	private JavaMailSender mailSender;

	public void sendWelcomeMail(String email) {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom("tejasshah2k19@gmail.com");
		message.setTo(email);
		message.setSubject("Welcome a board");
		message.setText("We are happy to onboarding you");
		mailSender.send(message);
		System.out.println("Mail sent successfully!");
	}
}
