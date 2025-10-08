package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	//singleton 
	@Bean
    PasswordEncoder getPasswordEncoder() {
    	return new BCryptPasswordEncoder();
    }
	
	 @Bean
	   Cloudinary cloudinary() {
	        return new Cloudinary(ObjectUtils.asMap(
	                "cloud_name", "dzko8yjs6",
	                "api_key", "812235955324293",
	                "api_secret", "myUUXHnsXifcK0DyinTVjQKan_U",
	                "secure", true
	        ));
	    }
}
