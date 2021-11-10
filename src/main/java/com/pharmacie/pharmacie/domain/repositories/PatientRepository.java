package com.pharmacie.pharmacie.domain.repositories;
import com.pharmacie.pharmacie.domain.entities.patient;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<patient, Long>{
    
}
