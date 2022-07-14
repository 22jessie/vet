/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jess.vet.validations;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


/**
 * @author jessica-22
 */
class ValidDateValidator implements ConstraintValidator<DateValidation,String> {

    @Override
    public boolean isValid(String date, ConstraintValidatorContext cvc) {
        boolean valid=false;
        try{
            LocalDate.parse(date,
                    DateTimeFormatter.ofPattern("dd-mm-yyyy").withResolverStyle(
                            ResolverStyle.STRICT));
            valid = true;
        } catch (DateTimeParseException e) {}
        return valid;
    }
    
}
