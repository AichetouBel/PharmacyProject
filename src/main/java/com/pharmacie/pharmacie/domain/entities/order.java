package com.pharmacie.pharmacie.domain.entities;

//import java.util.HashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="order") 
public class order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ordre_id")
    Long orderID;
    @Column(name = "client_id")
    Long clientID;
	public Long getOrderID() {
		return orderID;
	}
	public void setOrderID(Long orderID) {
		this.orderID = orderID;
	}
	public Long getClientID() {
		return clientID;
	}
	public void setClientID(Long clientID) {
		this.clientID = clientID;
	}
    
    
}
