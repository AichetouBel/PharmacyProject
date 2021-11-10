package com.pharmacie.pharmacie.domain.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Delivery {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	Long deliveryID;
	int clientID;
	String phoneNumber;
	String email;
	String address;
	String ville;
	String region;
	Date deliveryDate;
	String statut="pending";
	
	public Delivery() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Delivery(Long deliveryID, int clientID, String phoneNumber, String email, String address, String ville,
			String region, Date deliveryDate, String statut) {
		super();
		this.deliveryID = deliveryID;
		this.clientID = clientID;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.address = address;
		this.ville = ville;
		this.region = region;
		this.deliveryDate = deliveryDate;
		this.statut = statut;
	}

	public Long getDeliveryID() {
		return deliveryID;
	}

	public void setDeliveryID(Long deliveryID) {
		this.deliveryID = deliveryID;
	}

	public int getClientID() {
		return clientID;
	}

	public void setClientID(int clientID) {
		this.clientID = clientID;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public Date getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public String getStatut() {
		return statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}
	
}
