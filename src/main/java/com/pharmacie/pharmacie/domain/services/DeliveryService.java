package com.pharmacie.pharmacie.domain.services;

import java.util.Date;
import java.util.List;

import com.pharmacie.pharmacie.domain.entities.Delivery;

public interface DeliveryService {
	
	//
	
	// create delivery
	public Delivery createDeliv( Delivery delivery);
	// get delivery details
	public Delivery getDelivInfo (Long idDelivery);
	// update delivery
	public Delivery updateDeliv(Delivery deliv) throws Exception;
	// cancel delivery
	public void deleteDeliv(Long idDeliv);
	//get all deliveries
	public List<Delivery> getAllDelivery();
	//get all client deliveries
	public List<Delivery> getClientDelivery(Long clientID);
	//confirm delivery
//	public Delivery confirmDeliv(Long idDeliv, Date date);

}
