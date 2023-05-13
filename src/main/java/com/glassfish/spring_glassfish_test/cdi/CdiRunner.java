package com.glassfish.spring_glassfish_test.cdi;

import com.glassfish.spring_glassfish_test.beans.StudenDto;
import com.glassfish.spring_glassfish_test.qualifiers.CorporateQualifier;
import com.glassfish.spring_glassfish_test.qualifiers.CustomerService;
import com.glassfish.spring_glassfish_test.qualifiers.PersonalQualifier;
import com.glassfish.spring_glassfish_test.qualifiers.qualifier_enum.EmployeeService;
import com.glassfish.spring_glassfish_test.qualifiers.qualifier_enum.Qualifier;
import com.glassfish.spring_glassfish_test.qualifiers.qualifier_enum.Qualifiers;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Alternative;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import lombok.Data;

import java.util.List;
 //
@ApplicationScoped
@Data
@Named
public class CdiRunner {
    @Inject
    private String dynamicResponse;

    @Inject
    private List<StudenDto> studentDtos;

    @Inject @CorporateQualifier
    private CustomerService corporateCustomer;

     @Inject @PersonalQualifier
     private CustomerService personalCustomer;

     @Inject @Qualifier(Qualifiers.WORKER)
     private EmployeeService workerEmployee;

     @Inject @Qualifier(Qualifiers.ADMIN)
     private EmployeeService adminEmployee;

    public String  printCorporate(){
       return corporateCustomer.print();
    }

    public String  printAdmin(){
        return adminEmployee.print();
    }

     public String  printWorker(){
         return workerEmployee.print();
     }

     public String  printPersonal(){
         return personalCustomer.print();
     }
}
