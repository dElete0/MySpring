package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args){
        /*
        Name name = new Name();

        name.setName("Tom");

        ClassPathXmlApplicationContext: ApplicationContext 接口的实现类

        */

        //创建Spring 的 IOC 容器对象
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        //从IOC容器中获取Bean 的实例
        //利用id定位到容器中的bean
        //HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloWorld");
        //利用返回IOC容器中的bean，但要求只有一个Bean
        //HelloWorld helloWorld = ctx.getBean(HelloWorld.class);


        //System.out.println(helloWorld);

        //调用hello方法
        //helloWorld.hello();

        Person person = ctx.getBean(Person.class);
        System.out.println(person);
    }
}