/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jess.vet.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author jessica-22
 */

@Getter
@Setter
@MappedSuperclass
public class User extends BaseEntity{
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO,generator="native")
    @GenericGenerator(name="native",strategy="native")
    private int id;
    
    @NotBlank(message="Name cannot be blank")
    @Size(min=7, message="Name must contain at least 15 characters")
    @Size(max=40, message="Name cannot exceed 40 characters")
    private String name;
    
    @NotBlank(message="Email cannot be blank")
    @Email(message="Please provide a valid email")
    private String email;
    
    @NotBlank(message="Password cannot be blank")
    @Size(min=8, message="Password must contain at least 8 characters")
    @Size(max=15, message="Password cannot exceed 15 characters")
    private String password;
    
        
    private String role;
}
