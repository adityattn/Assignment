package ex6;

import ex6.ExceptionService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) throws Exception {
        ConfigurableApplicationContext context =
                new ClassPathXmlApplicationContext("spring-aspect-config.xml");
        context.start();
        ExceptionService exceptionService = (ExceptionService) context.getBean("exceptionService");
        exceptionService.throwException();
        context.stop();

    }
}