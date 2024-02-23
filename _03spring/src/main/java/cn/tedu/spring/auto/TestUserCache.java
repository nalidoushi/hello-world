package cn.tedu.spring.auto;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 测试类
 */
public class TestUserCache {
    public static void main(String[] args) {
        /*
            1.创建IoC容器;
            2.获取Spring Bean对象;
            3.打印输出测试.
         */
        ApplicationContext context = new AnnotationConfigApplicationContext("cn.tedu.spring.auto");
        UserCache userCache = context.getBean(UserCache.class);
        System.out.println("userCache = " + userCache);
    }
}
