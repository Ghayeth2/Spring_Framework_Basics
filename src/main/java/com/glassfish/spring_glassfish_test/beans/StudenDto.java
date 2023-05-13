package com.glassfish.spring_glassfish_test.beans;

import jakarta.inject.Named;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @Builder
@NoArgsConstructor
@AllArgsConstructor
// @Named does not give the   class the bean notify.
// to call the class as a bean we need its constructors both Argu & No Args
public class StudenDto {
    private String fullName;
    private int age;
}
