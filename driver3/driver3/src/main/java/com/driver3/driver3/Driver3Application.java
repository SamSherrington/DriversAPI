package com.driver3.driver3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication(scanBasePackages = {"com.driver3.driver3"})
@EnableJpaAuditing(auditorAwareRef="auditorAware")
public class Driver3Application {

	
	@Bean
	public AuditorAware<String> auditorAware() {
		
		return new AuditAware();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Driver3Application.class, args);
	}

}
