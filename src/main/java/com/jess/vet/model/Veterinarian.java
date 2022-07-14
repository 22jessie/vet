/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jess.vet.model;

import java.util.List;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author jessica-22
 */

@Getter
@Setter
class Veterinarian extends User{
    
    @NotBlank(message="Phone number must not be blank")
    @Pattern(regexp="^$|[0-9]{10}",message="Phone number must be 10 digits")
    private String phoneNumb;
    
    @NotBlank(message="Specialty cannot be blank")
    @Size(max=20)
    private String specialty;
    
    @NotBlank(message="About me cannot be blank")
    @Size(max=200)
    private String info;
    
    
    private List<Appointment> appointments;
}
