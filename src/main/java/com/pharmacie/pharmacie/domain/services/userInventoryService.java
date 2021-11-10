package com.pharmacie.pharmacie.domain.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pharmacie.pharmacie.domain.entities.userInventory;
import com.pharmacie.pharmacie.domain.repositories.userInventoryRepository;

@Service
public class userInventoryService {

	@Autowired
	private final userInventoryRepository uInvRepo;
	
	public userInventoryService(userInventoryRepository uInvRepo) {
		this.uInvRepo = uInvRepo;
	}
	
	public userInventory getUserInv(int id) {
        Long longid = Long.valueOf(id);
        return uInvRepo.getById(longid);
        }

    public List<userInventory> getUserInvAll() {
        return uInvRepo.findAll();
    }

    public void addUserInv(userInventory ui) {
        for (userInventory e : uInvRepo.findAll()) {
            if(e.equals(ui)) {
                return;
            }
        }
        uInvRepo.save(ui);
    }

    public void deleteUserInv(int id) {
        Long longid = Long.valueOf(id);
        uInvRepo.deleteById(longid);
    }
}
