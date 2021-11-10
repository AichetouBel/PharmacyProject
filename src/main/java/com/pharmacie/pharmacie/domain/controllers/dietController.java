package com.pharmacie.pharmacie.domain.controllers;

import java.util.List;

import com.pharmacie.pharmacie.domain.entities.diet;
import com.pharmacie.pharmacie.domain.services.dietService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class dietController {

    @Autowired
    private final dietService dService;

    public dietController(dietService dService) {
        this.dService = dService;
    }

    @GetMapping("/api/v1/diet/showAll")
    public List<diet> showAll() {
        return dService.getDietAll();
    }

    @PostMapping("/api/v1/diet/add")
    public void registerPatient(@RequestBody diet d) {
        dService.addDiet(d);
    }

    @DeleteMapping("/api/v1/diet/delete")
    public void deletePatient(@RequestBody int id) {
        dService.deleteDiet(id);
    }
    
    @RequestMapping("/backend/diets")
	public String backend(Model model) {
    	model.addAttribute("diets", dService.getDietAll());
		return "backend/diets";
	}
}
