package cn.tedu.spring.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * Controller：控制器层;
 * Service：业务逻辑层;
 * Repository：数据访问层;
 * Component：不分层,标识为一个普通的Spring Bean组件;
 */
//@Controller
//@Service
//@Repository
@Component
public class UserDao {
    // 数据库连接的URL地址, 用户名, 密码
    // jdbc:mysql://localhost:3306/库名
    /*
        1.@Value注解: 基本类型属性值注入
        2.注解添加位置:
          2.1 添加在属性上;
          2.2 添加在set方法上;
     */
    @Value("jdbc:mysql://localhost:3306/tedu")
    private String databaseUrl;
    @Value("root")
    private String username;
    //@Value("root")
    private String password;

    @Value("root")
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserDao{" +
                "databaseUrl='" + databaseUrl + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
