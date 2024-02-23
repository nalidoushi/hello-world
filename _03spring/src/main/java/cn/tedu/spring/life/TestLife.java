package cn.tedu.spring.life;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestLife {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("cn.tedu.spring.life");
        Life life = context.getBean(Life.class);
        //使用阶段
        System.out.println("4:使用阶段[getBean()]");
        //手动关闭IoC容器
        context.close();
    }
}
