package com.pharmacie.pharmacie.domain.entities;

import java.util.HashMap;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class pharmacy {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long pharmacyID;
    HashMap<Long,Integer> catalogue;
    
    public pharmacy() {
    }

    public pharmacy(Long pharmacyID, HashMap<Long, Integer> catalogue) {
        this.pharmacyID = pharmacyID;
        this.catalogue = catalogue;
    }

    public Long getPharmacyID() {
        return pharmacyID;
    }

    public void setPharmacyID(Long pharmacyID) {
        this.pharmacyID = pharmacyID;
    }

    public HashMap<Long, Integer> getCatalogue() {
        return catalogue;
    }

    public void setCatalogue(HashMap<Long, Integer> catalogue) {
        this.catalogue = catalogue;
    }

    
}
