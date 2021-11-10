package com.pharmacie.pharmacie.domain.entities;

import java.sql.Blob;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class patient extends user{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long clientID;
    String name;
    String familyName;
    Long CIN;
    Long cnamID;
    String dateOfBirth;
    Blob picture;
    boolean isNotificationOn;
    String address;
    @ElementCollection(targetClass = String.class)
    List<String> allergiesList;
    Long doctorID;
    boolean isPregnant;
    @ElementCollection(targetClass = String.class)
    List<String> familyList;
    boolean isBanned;
    String sex;
    @ElementCollection(targetClass = String.class)
    List<String> knownIllnesses;
    
    public patient() {
    }

    public patient(String username, String passwd,Long clientID, String name, String familyName, Long cIN, Long cnamID, String dateOfBirth, String address,
            String sex) {
    	super(username,passwd);
        this.clientID = clientID;
        this.name = name;
        this.familyName = familyName;
        CIN = cIN;
        this.cnamID = cnamID;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.sex = sex;
    }

    public Long getClientID() {
        return clientID;
    }

    public void setClientID(Long clientID) {
        this.clientID = clientID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public Long getCIN() {
        return CIN;
    }

    public void setCIN(Long cIN) {
        CIN = cIN;
    }

    public Long getCnamID() {
        return cnamID;
    }

    public void setCnamID(Long cnamID) {
        this.cnamID = cnamID;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Blob getPicture() {
        return picture;
    }

    public void setPicture(Blob picture) {
        this.picture = picture;
    }

    public boolean isNotificationOn() {
        return isNotificationOn;
    }

    public void setNotificationOn(boolean isNotificationOn) {
        this.isNotificationOn = isNotificationOn;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<String> getAllergiesList() {
        return allergiesList;
    }

    public void setAllergiesList(List<String> allergiesList) {
        this.allergiesList = allergiesList;
    }

    public Long getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(Long doctorID) {
        this.doctorID = doctorID;
    }

    public boolean isPregnant() {
        return isPregnant;
    }

    public void setPregnant(boolean isPregnant) {
        this.isPregnant = isPregnant;
    }

    public List<String> getFamilyList() {
        return familyList;
    }

    public void setFamilyList(List<String> familyList) {
        this.familyList = familyList;
    }

    public boolean isBanned() {
        return isBanned;
    }

    public void setBanned(boolean isBanned) {
        this.isBanned = isBanned;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public List<String> getKnownIllnesses() {
        return knownIllnesses;
    }

    public void setKnownIllnesses(List<String> knownIllnesses) {
        this.knownIllnesses = knownIllnesses;
    }

    
    


@Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + CIN.hashCode();
        result = prime * result + clientID.hashCode();
        result = prime * result + cnamID.hashCode();
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((sex == null) ? 0 : sex.hashCode());
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
        patient other = (patient) obj;
        if (CIN != other.CIN)
            return false;
        if (clientID != other.clientID)
            return false;
        if (cnamID != other.cnamID)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (sex == null) {
            if (other.sex != null)
                return false;
        } else if (!sex.equals(other.sex))
            return false;
        return true;
    }
}