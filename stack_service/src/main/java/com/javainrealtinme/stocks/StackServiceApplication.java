package com.javainrealtinme.stocks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages="com.javainrealtinme.stocks.repository")
@SpringBootApplication
public class StackServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(StackServiceApplication.class, args);
	}

}

