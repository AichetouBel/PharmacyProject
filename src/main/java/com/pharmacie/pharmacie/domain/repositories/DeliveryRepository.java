package com.pharmacie.pharmacie.domain.repositories;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pharmacie.pharmacie.domain.entities.Delivery;

public interface DeliveryRepository extends JpaRepository<Delivery, Long>{
	
	public List<Delivery> findByClientID(Long clientID);
	
}
