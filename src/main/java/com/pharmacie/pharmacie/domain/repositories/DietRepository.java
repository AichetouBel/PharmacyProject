package com.pharmacie.pharmacie.domain.repositories;
import com.pharmacie.pharmacie.domain.entities.diet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DietRepository extends JpaRepository<diet, Long>{
    
}
