package com.glassfish.spring_glassfish_test.qualifiers;
@PersonalQualifier
public class PersonalCustomerManager implements CustomerService{
    @Override
    public String print() {
        return "Personal Customer Manager";
    }
}
