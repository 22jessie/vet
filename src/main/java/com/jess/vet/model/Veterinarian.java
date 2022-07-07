/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jess.vet.model;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author jessica-22
 */

@Getter
@Setter
class Veterinarian extends User{
    private String phoneNumber;
    private String specialty;
    private String info;
    private List<Appointment> appointments;
}
