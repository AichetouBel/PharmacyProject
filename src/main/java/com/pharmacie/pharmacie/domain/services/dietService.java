package com.pharmacie.pharmacie.domain.services;

import java.util.List;

import com.pharmacie.pharmacie.domain.entities.diet;
import com.pharmacie.pharmacie.domain.repositories.DietRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class dietService {

    @Autowired
    private final DietRepository dRepo;

    public dietService(DietRepository dRepo) {
        this.dRepo = dRepo;
    }
    
    public diet getDiet(int id) {
        Long longid = Long.valueOf(id);
        return dRepo.getById(longid);
    }

    public List<diet> getDietAll() {
        return dRepo.findAll();
    }

    public void addDiet(diet d) {
        for (diet e : dRepo.findAll()) {
            if(e.equals(d)) {
                return;
            }
        }
        dRepo.save(d);
    }

    public void deleteDiet(int id) {
        Long longid = Long.valueOf(id);
        dRepo.deleteById(longid);
    }

}
