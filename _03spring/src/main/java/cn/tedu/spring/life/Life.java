package cn.tedu.spring.life;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Life {
    private String dest;

    public Life() {
        System.out.println("1:实例化[调用无参构造]");
    }

    @Value("努力学习,看世界")
    public void setDest(String dest) {
        this.dest = dest;
        System.out.println("2:属性赋值[调用set方法]");
    }

    //生命周期初始化方法
    @PostConstruct
    public void init(){
        System.out.println("3:初始化[执行init方法]");
    }

    //Spring Bean对象销毁之前执行的方法
    @PreDestroy
    public void destroy(){
        System.out.println("5:销毁方法[执行destroy方法]");
    }
}







