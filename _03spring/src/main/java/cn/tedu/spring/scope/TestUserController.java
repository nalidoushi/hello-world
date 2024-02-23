package cn.tedu.spring.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.security.acl.AclNotFoundException;

/**
 * 测试类
 */
public class TestUserController {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("cn.tedu.spring.scope");
        //第1次获取
        UserController bean1 = context.getBean(UserController.class);
        System.out.println(bean1);
        //第2次获取
        UserController bean2 = context.getBean(UserController.class);
        System.out.println(bean2);
    }
}







