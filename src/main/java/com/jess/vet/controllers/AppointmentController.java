/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jess.vet.controllers;

import com.jess.vet.model.Appointment;
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
@RequestMapping("appmnt")
public class AppointmentController {
    
    @GetMapping("/display")
    String displayAppointments(Model m){
        m.addAttribute("appointment",new Appointment());
        return "appointments.html";
    }
    
    @PostMapping("/schedule")
    public String setAppointment(@Valid @ModelAttribute("appointment")Appointment ap,Errors errorsList){
        if(errorsList.hasErrors()){
            return "appointments.html";
        }
        System.out.println("Cita registrada");
        
        return "redirect:/appmnt/display";
    }
    
}
