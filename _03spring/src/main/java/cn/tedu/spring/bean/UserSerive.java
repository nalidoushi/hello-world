package cn.tedu.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserSerive {
    /*
        1.@Autowired注解:注入对象或者接口类型的数据;
     */
    @Autowired
    private UserDao userDao;

    @Override
    public String toString() {
        return "UserSerive{" +
                "userDao=" + userDao +
                '}';
    }
}
