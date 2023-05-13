package com.glassfish.spring_glassfish_test.qualifiers.qualifier_enum;

// By using enum and its value() method we can do same functionality
// as multiple interfaces, but in here it will be easier and clean code generator
// bcz we r replacing multiple interfaces with one Enum Collection holding all values
public enum Qualifiers {
    WORKER,
    ADMIN
}
