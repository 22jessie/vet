/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jess.vet.model;

import java.util.List;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
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
    @Size(min=15,max=40)
    private String name;
    
    @NotBlank(message="Email cannot be blank")
    @Email(message="Please provide a valid email")
    private String email;
    
    @NotBlank(message="Password cannot be blank")
    @Pattern(regexp="(?=.\\d)(?=.[a-z])(?=.[A-Z])((?=.\\W)",
            message="Password should contain at least one capital letter, one digit and one lower case letter")
    @Size(min=8,max=15)
    private String password;
        
    private String role;
}
