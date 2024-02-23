package cn.tedu.spring.auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class UserCache {
    /*
        1.required参数:
          * true[默认]:装配失败会抛出异常;
          * false:装配失败也不会抛出异常,一般不使用;
        2.Autowired注解,只能根据类型[Java类型|接口类型]进行装配,不能根据Spring Bean对象名称装配;
          * 问题:如果一个接口有多个实现类时,就无法使用该注解进行装配;
          * 解决问题:结合Qualifier注解,根据IoC容器中Spring Bean对象的名称进行装配;
        3.Qualifier注解:
          * 根据IoC容器中 Spring Bean 对象的名称进行装配;
          * value参数的值: Bean对象名称[默认类名首字母小写].
     */
    @Autowired(required = true)
    @Qualifier(value = "AAAA")
    private Cache cache;
}














