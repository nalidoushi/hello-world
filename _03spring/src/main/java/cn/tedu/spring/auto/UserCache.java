package cn.tedu.spring.auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserCache {
    /*
        required参数:
        * true[默认]:装配失败会抛出异常;
        * false:装配失败也不会抛出异常,一般不使用;
     */
    @Autowired(required = true)
    private Cache cache;
}














