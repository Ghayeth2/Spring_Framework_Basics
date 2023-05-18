package com.glassfish.spring_glassfish_test.interceptor;

import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@Interceptor
@InterceptorCostumized
public class InterceptorBase {
    @AroundInvoke public Object logging(InvocationContext context){
        System.out.printf("The first state: "+context.getMethod().getName());

        // User: logged in or not
        boolean isLogin = true;

        Object isContinue = null; // if there's no intercepting then continue

        if(isLogin){
            try {
                // user is logged in, he/she can proceed into core system
                isContinue = context.proceed();
                System.out.printf("The next state: "+isContinue);
                return isContinue;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }else{
            // user ain't logged into system. will be prevented from proceeding into core system
            System.out.printf("Please, login first!!");
            return null;
        }
    }
}
