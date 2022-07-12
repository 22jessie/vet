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
public class User {
    private String name;
    private int id;
    private String email;
    private String password;
    private List<String> roles;
}
