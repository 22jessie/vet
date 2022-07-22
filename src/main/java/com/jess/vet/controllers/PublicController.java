/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jess.vet.controllers;

import com.jess.vet.model.Client;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author jessica-22
 */


@Controller
@RequestMapping("public")
public class PublicController {
    
    @GetMapping("/signup")
    public String signup(Model model){
        model.addAttribute("client", new Client());
        return "signup.html";
    }
    
    @PostMapping("/signup")
    public String registerClient(@Valid @ModelAttribute("client") Client c,
            Errors errorList){
        if(errorList.hasErrors()){
           return "signup.html";
        }
        return "redirect:login?created=true";
    }
    
}
