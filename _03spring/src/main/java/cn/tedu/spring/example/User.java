package cn.tedu.spring.example;

import org.springframework.stereotype.Component;
/*
@Component注解:将此类表示为一个Spring Framework的组件;
 */
@Component
public class User {
    public void run(){
        System.out.println("Hello,Spring Framework");
    }
}
