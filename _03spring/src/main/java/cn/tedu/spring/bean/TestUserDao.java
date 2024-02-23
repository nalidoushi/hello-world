package cn.tedu.spring.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestUserDao {
    public static void main(String[] args) {
        // Ctrl + Shift + Alt + c
        ApplicationContext context = new AnnotationConfigApplicationContext("cn.tedu.spring.bean");
        // .var + 回车
        UserSerive userSerive = context.getBean(UserSerive.class);
        System.out.println("userSerive = " + userSerive);
    }
}
