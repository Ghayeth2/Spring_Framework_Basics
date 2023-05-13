package com.glassfish.spring_glassfish_test.qualifiers.qualifier_enum;
@Qualifier(Qualifiers.WORKER)
public class WorkerManager implements EmployeeService {
    @Override
    public String print() {
        return "Worker Employee Manager";
    }
}
