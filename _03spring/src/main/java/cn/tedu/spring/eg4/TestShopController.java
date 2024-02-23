package cn.tedu.spring.eg4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestShopController {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("cn.tedu.spring.eg4");
        ShopController shopController = context.getBean(ShopController.class);
        //使用
        System.out.println("4:开发者使用");
        context.close();
    }
}
