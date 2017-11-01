package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args){
        /*
        Name name = new Name();

        name.setName("Tom");

        */

        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloWorld");

        helloWorld.hello();
    }
}