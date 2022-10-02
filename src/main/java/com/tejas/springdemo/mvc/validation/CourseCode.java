package com.tejas.springdemo.mvc.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Target({ ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {
	
	public String value() default "TEJ";
	
	public String message() default "It should always start with TEJ";
	
	public Class<?>[] groups() default{};
	
	public Class<? extends Payload>[] payload() default{};

}
