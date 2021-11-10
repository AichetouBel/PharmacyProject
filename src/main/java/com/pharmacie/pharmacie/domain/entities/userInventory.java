package com.pharmacie.pharmacie.domain.entities;

import java.util.HashMap;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class userInventory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long inventoryID;
    
    Long clientID;
    HashMap<Long,Integer> medecines;
    
    public userInventory() {
    }

    public userInventory(Long inventoryID, Long clientID, HashMap<Long, Integer> medecines) {
        this.inventoryID = inventoryID;
        this.clientID = clientID;
        this.medecines = medecines;
    }

    public Long getInventoryID() {
        return inventoryID;
    }

    public void setInventoryID(Long inventoryID) {
        this.inventoryID = inventoryID;
    }

    public Long getClientID() {
        return clientID;
    }

    public void setClientID(Long clientID) {
        this.clientID = clientID;
    }

    public HashMap<Long, Integer> getMedecines() {
        return medecines;
    }

    public void setMedecines(HashMap<Long, Integer> medecines) {
        this.medecines = medecines;
    }

	@Override
	public int hashCode() {
		return Objects.hash(clientID, inventoryID, medecines);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		userInventory other = (userInventory) obj;
		return clientID == other.clientID && inventoryID == other.inventoryID
				&& Objects.equals(medecines, other.medecines);
	}
    
    

    
}
