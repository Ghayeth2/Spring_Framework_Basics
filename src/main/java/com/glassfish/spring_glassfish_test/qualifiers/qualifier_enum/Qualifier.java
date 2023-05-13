package com.glassfish.spring_glassfish_test.qualifiers.qualifier_enum;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@jakarta.inject.Qualifier
@Target({TYPE,METHOD,PARAMETER,FIELD})
@Retention(RUNTIME)
@Documented
public @interface Qualifier {
    // By using enum and its value() method we can do same functionality
    // as multiple interfaces, but in here it will be easier and clean code generator
    // bcz we r replacing multiple interfaces with one Enum Collection holding all values
    Qualifiers value();
}
