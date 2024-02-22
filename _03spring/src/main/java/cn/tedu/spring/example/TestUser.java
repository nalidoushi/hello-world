package cn.tedu.spring.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 测试
 */
public class TestUser {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        /*
            方式1:通过new关键字方式创建对象
         */
        User user1 = new User();
        user1.run();

        /*
            方式2:通过反射的方式
         */
        Class zz = Class.forName("cn.tedu.spring.example.User");
        User user2 = (User) zz.newInstance();
        user2.run();

        /*
            方式3:通过 Spring Framework 框架创建对象
            1.Spring Framework会扫描指定包路径下的所有类,将所有加着@Component注解的类,
              创建 Spring Bean 对象,将这些Bean对象放入 IoC容器;
            2.context.getBean(User.class)方法,可以从 IoC 容器中获取指定类型的Bean对象;
            3.user3.run():用于测试
         */
        ApplicationContext context = new AnnotationConfigApplicationContext("cn.tedu.spring.example");
        User user3 = context.getBean(User.class);
        user3.run();
    }
}








