package cn.tedu.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserSerive {
    /*
        1.@Autowired注解:注入对象或者接口类型的数据;
        2.添加位置
          2.1 添加在属性上;
          2.2 添加在set方法上;
          2.3 添加在构造方法上;
     */
    //@Autowired
    private UserDao userDao;

    //@Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Autowired
    public UserSerive(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public String toString() {
        return "UserSerive{" +
                "userDao=" + userDao +
                '}';
    }
}
