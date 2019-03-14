package ex8;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PointCutAspects {

    @After("displayPointcut()")
    void afterAdvice(){
        System.out.println("Running after advice");
    }

    @Pointcut("execution(void display())")
    void displayPointcut(){}

    @Pointcut("execution(String getString())")
    void getStringPointcut(){}
}
