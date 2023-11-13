package com.mikhail.spring.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CheckEmailValidator
        // CheckEmail - аннотация, которая будет обрабатываться данным классом
        // String - тип данных, которые будут обрабатываться
        implements ConstraintValidator<CheckEmail, String> {

    /**
     * конечная часть email после символа @
     */
    private String endOfEmail;

    @Override
    public void initialize(CheckEmail checkEmail) {
        endOfEmail = checkEmail.value(); // значение поля из аннотации
    }

    @Override
    public boolean isValid(
            String enteredValue,
            ConstraintValidatorContext constraintValidatorContext
    ) {

        return enteredValue.endsWith(endOfEmail);
    }
}
