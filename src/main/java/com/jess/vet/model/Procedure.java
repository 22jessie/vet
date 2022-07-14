/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jess.vet.model;

import com.jess.vet.validations.DateValidation;
import java.util.Date;
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
public class Procedure extends BaseEntity {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO,generator="native")
    @GenericGenerator(name="native",strategy="native")
    private long id;
    
    @NotBlank(message="Description cannot be blank")
    @Size(min=5,max=200)
    private String description;
    
    @NotBlank(message="Date cannot be blank")
    @DateValidation
    String date;
    
    private Veterinarian vet;
}
