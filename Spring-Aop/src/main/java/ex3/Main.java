package ex3;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main{
    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                new ClassPathXmlApplicationContext("Spring-Config.xml");

        EventPublisher cvp =
                (EventPublisher) context.getBean("customEventPublisher");

        cvp.connect();

    }
}
