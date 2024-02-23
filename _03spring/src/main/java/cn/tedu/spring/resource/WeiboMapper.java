package cn.tedu.spring.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class WeiboMapper {
    /*
        Resource: 装配对象或接口类型的数据
        第1步:根据Spring Bean对象的名称进行装配[该注解的name参数的值];
        第2步:未指定名称,把属性名作为Spring Bean对象的名称进行装配;
        第3步:如果属性名和Spring Bean对象的名称也不一致,则根据类型进行装配
     */
    //@Resource(name = "resMapperImpl1")
    @Resource
    private ResMapper resMapperImpl1;
}








