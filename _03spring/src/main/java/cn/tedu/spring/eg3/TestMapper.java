package cn.tedu.spring.eg3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 测试类
 */
public class TestMapper {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("cn.tedu.spring.eg3");
        CommentMapper commentMapper = context.getBean(CommentMapper.class);
        System.out.println("commentMapper = " + commentMapper);
    }
}
