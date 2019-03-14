package ex7;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class ServiceBeanAspects {


//    @Before("bean(serviceBean))")
//    void beforeAdvice() {
//        System.out.println("Running before advice");
//    }

    @Before("args(Integer)")
    void beforeAdvice() {
        System.out.println("Running before advice");
    }
//    @Before("this(ex7.ServiceBean)")
//    void beforeAdvice() {
//        System.out.println("Running before advice");
//    }
}
