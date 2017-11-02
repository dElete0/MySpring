package autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args){

        ApplicationContext ctx = new ClassPathXmlApplicationContext("relation.xml");

        Car car = (Car) ctx.getBean("car1");

        System.out.println(car);
    }
}
