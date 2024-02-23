package cn.tedu.spring.auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserCache {
    @Autowired
    private Cache cache;
}








