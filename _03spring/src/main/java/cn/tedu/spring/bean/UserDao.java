package cn.tedu.spring.bean;

import org.springframework.stereotype.Component;

@Component
public class UserDao {
    // 数据库连接的URL地址, 用户名, 密码
    // jdbc:mysql://localhost:3306/库名
    private String databaseUrl;
    private String username;
    private String password;

    @Override
    public String toString() {
        return "UserDao{" +
                "databaseUrl='" + databaseUrl + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
