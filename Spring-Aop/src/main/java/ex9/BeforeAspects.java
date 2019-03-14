package ex9;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
@Aspect
public class BeforeAspects {

    @Before("execution(void display())")
    void beforeAdvice() {
        System.out.println("Running before advice");
    }
}

