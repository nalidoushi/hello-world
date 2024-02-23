package cn.tedu.spring.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WeiboMapper {
    @Autowired
    private ResMapper resMapper;
}
