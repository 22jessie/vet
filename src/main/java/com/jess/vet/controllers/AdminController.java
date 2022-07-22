/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jess.vet.controllers;

import org.springframework.context.annotation.Configuration;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jess.vet.model.Veterinarian;
import javax.validation.Valid;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author jessica-22
 */

@Configuration
@RequestMapping("admin")
public class AdminController {
    
    @GetMapping("/vets")
    public String registerVet(Model model){
        model.addAttribute("vet",new Veterinarian());
        return "vets.html";
    }
    
    @PostMapping("/register-vet")
    public String registerVet(@Valid @ModelAttribute("vet")Veterinarian vet, Errors errorsList){
        if(errorsList.hasErrors()){
            return "vets.html";
        }
        System.out.println("Vet registered");
        return "redirect:/admin/vets";
    }
    
}
