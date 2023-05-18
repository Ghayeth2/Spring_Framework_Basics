package com.glassfish.spring_glassfish_test.aop.stereotypes;

import lombok.Data;

/*
    in this place instead of putting @Named & Scope annotations here and taking space in here
    we combine them with ones that can hold them in it, like in Spring Boot the @SpringBootApplication
    Annotation and what it contains in it, whenever we call it any held annotation inside it will get
    activated. It is same thing in here by using @Stereotype which holds same type annotations such as
    @Named & @ApplicationScoped or @RequestScoped
 */
@StereoType // @Named & @ApplicationScoped r defined now
@Data
public class StereoTypeBean {
    private int id;
    private String name = "GHAYETH AL MASRI";
}
