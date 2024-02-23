package cn.tedu.spring.resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestWeiboMapper {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("cn.tedu.spring.resource");
        WeiboMapper weiboMapper = context.getBean(WeiboMapper.class);
        System.out.println("weiboMapper = " + weiboMapper);
    }
}
