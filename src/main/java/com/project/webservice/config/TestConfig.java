package com.project.webservice.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.project.webservice.entities.User;
import com.project.webservice.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "pedro1", "pedro1@gmail.com", "0000", "123");
		User u2 = new User(null, "vinicius1", "vinicius1@gmail.com", "1111", "123");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
	}
	
	
}
