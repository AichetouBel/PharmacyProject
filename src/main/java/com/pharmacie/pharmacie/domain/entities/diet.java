package com.pharmacie.pharmacie.domain.entities;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class diet {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long dietID;
    Long clientID;
    @OneToMany(targetEntity=medecine.class, mappedBy="medecineID", fetch=FetchType.EAGER)
    List<Long> medecinesID;
    @ElementCollection(targetClass = String.class)
    List<String> foodsNotAllowed;
    @ElementCollection(targetClass = String.class)
    List<String> foodsAllowed;
    
    public diet() {
    }

    public diet(Long dietID, Long clientID, List<Long> medecinesID, List<String> foodsNotAllowed,
            List<String> foodsAllowed) {
        this.dietID = dietID;
        this.clientID = clientID;
        this.medecinesID = medecinesID;
        this.foodsNotAllowed = foodsNotAllowed;
        this.foodsAllowed = foodsAllowed;
    }



    public Long getDietID() {
        return dietID;
    }

    public void setDietID(Long dietID) {
        this.dietID = dietID;
    }

    public Long getClientID() {
        return clientID;
    }

    public void setClientID(Long clientID) {
        this.clientID = clientID;
    }

    public List<Long> getMedecinesID() {
        return medecinesID;
    }

    public void setMedecinesID(List<Long> medecinesID) {
        this.medecinesID = medecinesID;
    }

    public List<String> getFoodsNotAllowed() {
        return foodsNotAllowed;
    }

    public void setFoodsNotAllowed(List<String> foodsNotAllowed) {
        this.foodsNotAllowed = foodsNotAllowed;
    }

    public List<String> getFoodsAllowed() {
        return foodsAllowed;
    }

    public void setFoodsAllowed(List<String> foodsAllowed) {
        this.foodsAllowed = foodsAllowed;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + clientID.hashCode();
        result = prime * result + dietID.hashCode();
        result = prime * result + ((foodsAllowed == null) ? 0 : foodsAllowed.hashCode());
        result = prime * result + ((foodsNotAllowed == null) ? 0 : foodsNotAllowed.hashCode());
        result = prime * result + ((medecinesID == null) ? 0 : medecinesID.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        diet other = (diet) obj;
        if (clientID != other.clientID)
            return false;
        if (dietID != other.dietID)
            return false;
        if (foodsAllowed == null) {
            if (other.foodsAllowed != null)
                return false;
        } else if (!foodsAllowed.equals(other.foodsAllowed))
            return false;
        if (foodsNotAllowed == null) {
            if (other.foodsNotAllowed != null)
                return false;
        } else if (!foodsNotAllowed.equals(other.foodsNotAllowed))
            return false;
        if (medecinesID == null) {
            if (other.medecinesID != null)
                return false;
        } else if (!medecinesID.equals(other.medecinesID))
            return false;
        return true;
    }

    
}
