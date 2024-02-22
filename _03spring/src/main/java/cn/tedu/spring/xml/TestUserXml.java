package cn.tedu.spring.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试类
 */
public class TestUserXml {
    public static void main(String[] args) {
        /*
            1.创建IoC容器[xml方式];
            2.获取Spring Bean对象;
            3.测试
         */
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        // context.getBean(UserXml.class).var + 回车
        UserXml userXml = context.getBean(UserXml.class);
        userXml.run();
        System.out.println("userXml = " + userXml);
    }
}







