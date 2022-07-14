/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jess.vet.model;

import java.util.Date;
import java.util.List;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author jessica-22
 */
@Getter
@Setter
public class Client extends User {
    
    @NotBlank(message="Phone number must not be blank")
    @Pattern(regexp="^$|[0-9]{10}",message="Phone number must be 10 digits")
    private String phoneNumb;
    
    private List<Pet> pets;
    private List<Appointment> appointments;
    
    
    
}
