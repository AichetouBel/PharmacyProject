package com.pharmacie.pharmacie.domain.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class admin extends user{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long adminID;

    public admin(Long adminID) {
        this.adminID = adminID;
    }

    public admin() {
    }

    public Long getAdminID() {
        return adminID;
    }

    public void setAdminID(Long adminID) {
        this.adminID = adminID;
    }
    
}
