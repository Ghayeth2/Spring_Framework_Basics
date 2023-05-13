package com.glassfish.spring_glassfish_test.qualifiers.qualifier_enum;
@Qualifier(Qualifiers.ADMIN)
public class AdminstratorManager implements EmployeeService {
    @Override
    public String print() {
        return "Admin Employee Manager";
    }
}
