/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jess.vet.model;

import com.jess.vet.validations.DateValidation;
import java.util.Date;
import java.util.List;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
public class Pet extends BaseEntity{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO,generator="native")
    @GenericGenerator(name="native",strategy="native")
    private int id;
    
    @DateValidation
    @NotBlank
    private String dateOfBirth;
    
    @NotBlank(message="Name cannot be blank")
    @Size(min=1,max=20)
    private String name;
    
    @NotBlank(message="Gender cannot be blank")
    @Size(max=1)
    private char gender;
    
    @NotBlank(message="Breed cannot be blank")
    @Size(min=3,max=20)
    private String breed;
    
    @NotBlank(message="Color cannot be blank")
    @Size(min=3,max=20)
    private String color;
    
    private Client owner;
    
    private List<Procedure> procedures;
}
