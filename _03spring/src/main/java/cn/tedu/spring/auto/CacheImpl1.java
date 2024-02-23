package cn.tedu.spring.auto;

import org.springframework.stereotype.Component;

/**
 * 1.@Component: IoC容器中,Spring Bean对象的名称为:cacheImpl1;
 * 2.@Component(value = "AAAA"): IoC容器中,Spring Bean对象的名称为: AAAA
 */
@Component(value = "AAAA")
public class CacheImpl1 implements Cache{
}







