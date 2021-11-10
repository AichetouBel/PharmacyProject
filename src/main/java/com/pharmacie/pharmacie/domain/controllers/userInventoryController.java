package com.pharmacie.pharmacie.domain.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import com.pharmacie.pharmacie.domain.entities.userInventory;
import com.pharmacie.pharmacie.domain.services.userInventoryService;

@Controller
public class userInventoryController {
	
	@Autowired
	private final userInventoryService uInvService;
	
	public userInventoryController(userInventoryService uInvService) {
		this.uInvService = uInvService;
	}
	
	@GetMapping("/api/v1/userinv/showAll")
    public List<userInventory> showAll() {
        return uInvService.getUserInvAll();
    }

    @PostMapping("/api/v1/userinv/add")
    public void registerUserInv(@RequestBody userInventory ui) {
        uInvService.addUserInv(ui);
    }

    @DeleteMapping("/api/v1/userinv/delete")
    public void deleteUserInv(@RequestBody int id) {
        uInvService.deleteUserInv(id);
    }
    
    @RequestMapping("/backend/userinv")
	public String backend(Model model) {
    	model.addAttribute("uinvs", uInvService.getUserInvAll());
		return "backend/inventories";
	}

}
