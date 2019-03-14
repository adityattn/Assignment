package ex9;

import ex9.BeforeAdvice;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {


    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                new ClassPathXmlApplicationContext("spring-aspect-config.xml");
        context.start();
        BeforeAdvice beforeAdvice=(BeforeAdvice) context.getBean("beforeAdvice");
         beforeAdvice.display();
        context.stop();

    }
}
