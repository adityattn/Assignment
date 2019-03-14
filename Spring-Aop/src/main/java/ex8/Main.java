package ex8;

import ex8.PointCutService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

public class Main {


    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                new ClassPathXmlApplicationContext("spring-aspect-config.xml");
        context.start();
        PointCutService pointCutService=(PointCutService) context.getBean("pointCutService");
        pointCutService.display();
        System.out.println(pointCutService.getString());

        context.stop();

    }
}
