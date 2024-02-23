package cn.tedu.spring.eg2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 测试类
 */
public class TestProduct {
    public static void main(String[] args) {
        //Ctrl + Shift + Alt + c
        ApplicationContext context = new AnnotationConfigApplicationContext("cn.tedu.spring.eg2");
        Product product = context.getBean(Product.class);
        System.out.println("product = " + product);
    }
}








