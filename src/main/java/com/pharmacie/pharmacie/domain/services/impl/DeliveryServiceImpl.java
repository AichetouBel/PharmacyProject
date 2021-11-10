package com.pharmacie.pharmacie.domain.services.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pharmacie.pharmacie.domain.entities.Delivery;

import com.pharmacie.pharmacie.domain.repositories.DeliveryRepository;
import com.pharmacie.pharmacie.domain.services.DeliveryService;

@Service
public class DeliveryServiceImpl implements DeliveryService{
	
	@Autowired
	private DeliveryRepository delivRepos;
	
	
	@Override
	public List<Delivery> getAllDelivery(){
		return delivRepos.findAll();
		
	}
	
	@Override
	public List<Delivery> getClientDelivery(Long clientID){
		return delivRepos.findByClientID(clientID);
	}
	
	// create delivery
	@Override
	public Delivery createDeliv( Delivery delivery) {
		return delivRepos.save(delivery);
	}
	// get delivery details
	@Override
	public Delivery getDelivInfo (Long idDelivery) {
		return delivRepos.findById(idDelivery).get();
	}
	// update delivery
	@Override
	public Delivery updateDeliv(Delivery deliv) throws Exception {
		Optional<Delivery> delivery= delivRepos.findById(deliv.getDeliveryID());
		if (!delivery.isPresent()) {
			throw new Exception("delivery doesn't exist!");
			
		}
		return delivRepos.save(deliv) ;
	}
	
	// cancel delivery
	@Override
	public void deleteDeliv(Long idDeliv) {
		delivRepos.deleteById(idDeliv);
	}
	
//	@Override
//	public Delivery confirmDeliv(Long idDeliv, Date date) {
//		Delivery delivery= delivRepos.findById(idDeliv);
//		delivery.setDeliveryDate(date);
//		delivery.setStatut("confirmed");
//		return delivRepos.save(delivery);
//		
//	}

}
