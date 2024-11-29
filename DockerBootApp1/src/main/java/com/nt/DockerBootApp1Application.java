package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockerBootApp1Application {

	public static void main(String[] args) {
		SpringApplication.run(DockerBootApp1Application.class, args);
		System.out.println("Welcome to Docker Spring boot App");
	}

}
