/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jess.vet.model;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author jessica-22
 */
@Getter
@Setter
public class Procedure {
    private long id;
    private String description;
    private Veterinarian vet;
    Date date;
}
