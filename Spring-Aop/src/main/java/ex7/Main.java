package ex7;

import ex9.BeforeAdvice;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                new ClassPathXmlApplicationContext("spring-aspect-config.xml");
        context.start();
        ServiceBean serviceBean=(ServiceBean) context.getBean("serviceBean");
        serviceBean.display();
        serviceBean.multiply(10);
        serviceBean.sum(20);
        context.stop();

    }



}
