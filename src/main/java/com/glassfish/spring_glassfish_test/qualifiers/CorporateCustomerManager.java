package com.glassfish.spring_glassfish_test.qualifiers;
@CorporateQualifier
public class CorporateCustomerManager implements CustomerService{
    @Override
    public String print() {
        return "Corporate Customer Manager";
    }
}
