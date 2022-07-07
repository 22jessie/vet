/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jess.vet.model;

import java.util.Date;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author jessica-22
 */
@Getter
@Setter
class Pet {
    private int id;
    private Date dob;
    private String name;
    private List<Procedure> procedures;
    private char gender;
    private String breed;
    private String color;
}
