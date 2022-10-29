package com.undostres.dummy_email;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class DummyEmailApplication {

	public static void main(String[] args) {
		SpringApplication.run(DummyEmailApplication.class, args);
	}

}
