package cn.tedu.spring.file;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Repository;

@PropertySource(value = "classpath:application.properties")
@Repository
public class Database {
    @Value("${spring.datasource.url}")
    private String url;
    @Value("${spring.datasource.username}")
    private String uname;
    @Value("${spring.datasource.password}")
    private String pwd;

    @Override
    public String toString() {
        return "Database{" +
                "url='" + url + '\'' +
                ", uname='" + uname + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
