package com.fn.fnregistrycenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class FnRegistryCenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(FnRegistryCenterApplication.class, args);
	}

}
