package com.glassfish.spring_glassfish_test.cdi;

import com.glassfish.spring_glassfish_test.beans.StudenDto;
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

}
