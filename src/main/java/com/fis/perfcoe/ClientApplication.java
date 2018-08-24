package com.fis.perfcoe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.web.client.RestTemplateBuilder;

@SpringBootApplication
public class ClientApplication {

	public static void main(String[] args) {
		SpringApplication.run( ClientApplication.class, args);
	}
	
   @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {

        return builder.build();

    }
}
