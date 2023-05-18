package com.glassfish.spring_glassfish_test.stereotypes;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Stereotype;
import jakarta.inject.Named;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/*

 */
@Stereotype
@Target({TYPE, METHOD, FIELD})
@Retention(RUNTIME)
@Documented

// those two are for any class that uses the super annotation (@StereoType)
// they will be identified in there internally.
@Named
@ApplicationScoped
public @interface StereoType {
}
