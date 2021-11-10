package com.pharmacie.pharmacie.domain.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class moderator extends user {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long moderatorID;

    public moderator() {
        super();
    }

    public moderator(Long moderatorID) {
        this.moderatorID = moderatorID;
    }

    public Long getModeratorID() {
        return moderatorID;
    }

    public void setModeratorID(Long moderatorID) {
        this.moderatorID = moderatorID;
    }
    
}
