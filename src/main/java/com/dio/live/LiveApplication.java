package com.dio.live;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.dio.live.model")
public class LiveApplication {

	public static void main(String[] args) {
		SpringApplication.run(LiveApplication.class, args);
	}

}
