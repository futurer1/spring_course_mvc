package com.mikhail.spring.mvc.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CheckEmailValidator.class) // указан класс, который будет валидировать
public @interface CheckEmail {
    // аннотация для кастомной валидации email

    public String value() default "xyz.com";

    public String message() default "end email is not xyz.com";

    public Class<?>[] groups() default {};

    public Class<? extends Payload>[] payload() default {};
}
