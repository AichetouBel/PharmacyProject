package com.pharmacie.pharmacie.domain.configs;

import com.pharmacie.pharmacie.domain.repositories.PatientRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class patientConfig {
    
    @Bean
    CommandLineRunner commandLineRunner(PatientRepository repo) {
        return args -> {
            
        };
    }
}
