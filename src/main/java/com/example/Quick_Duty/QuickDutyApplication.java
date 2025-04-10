package com.example.Quick_Duty;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class QuickDutyApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuickDutyApplication.class, args);
	}

	@Bean
	public ModelMapper ModelMapper() {
		return new ModelMapper();
	}
}
