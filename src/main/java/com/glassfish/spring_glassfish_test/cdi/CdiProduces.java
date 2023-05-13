package com.glassfish.spring_glassfish_test.cdi;

import com.glassfish.spring_glassfish_test.beans.StudenDto;
import jakarta.enterprise.context.RequestScoped;
import jakarta.enterprise.inject.Alternative;
import jakarta.enterprise.inject.New;
import jakarta.enterprise.inject.Produces;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RequestScoped
@Named(value = "cdiProduces")
@Setter @Getter
public class CdiProduces {
    private String response;

    public CdiProduces() {
        this.response = "This is a dynamic response from Cdi package";
    }

    @Produces
    public String getDynamicResponse(){
        return this.response;
    }


    // The problem  were from the beans.xml file where my default-bean-discovery was only for "annotated"
    // we either go and annotate our bean class with the correct annotation in our case it won't be (@Named)
    // or we remove the restriction from  beans-discovery to "all" so CDI can identify our bean class
    // and instantiate new bean to help us injection it in specified point.
    @Produces
    public List<StudenDto>  getStudentList(@New StudenDto studenDtos){
        List<StudenDto> students = new ArrayList<>();
        // students.addAll(List.of(...)

        students.addAll(Arrays.asList(
                StudenDto.builder().fullName("GHAYETH AL MASRI").age(23).build(),
                StudenDto.builder().fullName("ENES MUSA").age(24).build(),
                StudenDto.builder().fullName("MOHAMMAD AL MASRI").age(27).build(),
                StudenDto.builder().fullName("IBRAHIM MUYAD").age(23).build(),
                StudenDto.builder().fullName("ABDULLAH AMOURY").age(23).build()
        ));
        return students;
    }

}