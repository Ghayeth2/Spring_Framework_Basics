package com.glassfish.spring_glassfish_test.interceptor;
@InterceptorCostumized
public class Login {

    public String isLogin(String data){
        return "is login "+data;
    }
}
