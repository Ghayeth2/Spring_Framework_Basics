package com.glassfish.spring_glassfish_test.aop.interceptor;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.io.Serializable;
@Named(value = "aopInterceptor")
@ApplicationScoped
public class AopBean implements Serializable {
    private static final Long serialVersionUID = 1L;

    @Inject
    private Login login;

    public String getAopBean(){
        return this.login.isLogin("Yes");
    }
}
