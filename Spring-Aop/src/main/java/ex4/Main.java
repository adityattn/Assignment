package ex4;

import ex3.EventPublisher;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                new ClassPathXmlApplicationContext("spring-aspect-config.xml");
            context.start();
          Service service=(Service) context.getBean("service1");
          service.display();

         context.stop();

    }
}
