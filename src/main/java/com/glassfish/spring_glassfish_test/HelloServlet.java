package com.glassfish.spring_glassfish_test;

import   java.io.*;

import jakarta.enterprise.context.RequestScoped;
import jakarta.enterprise.inject.Alternative;
import jakarta.enterprise.inject.Produces;
import jakarta.inject.Named;
import lombok.Getter;
import lombok.Setter;

@RequestScoped
@Named(value = "cdiBean")
@Setter @Getter
@Alternative
public class HelloServlet  {
    private String response;

    public HelloServlet() {
        this.response = "This is a dynamic response";
    }

    @Produces
    public String getDynamicResponse(){
        return this.response;
    }

}