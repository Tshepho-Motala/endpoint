package com.conversion.endpoint;

import com.conversion.endpoint.model.UserRepository;
import com.conversion.endpoint.model.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class EndpointApplication {

	public static void main(String[] args) {
		SpringApplication.run(EndpointApplication.class, args);
	}

	@Bean
	CommandLineRunner init(UserRepository userRepository) {
		return args -> {
			Stream.of("Celsius", "Kelvin", "Miles", "Kilometers").forEach(name -> {
				User user = new User(name, name.toLowerCase());
				userRepository.save(user);
			});
			userRepository.findAll().forEach(System.out::println);
		};
	}

}
