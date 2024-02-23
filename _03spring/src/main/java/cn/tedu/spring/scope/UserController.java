package cn.tedu.spring.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

/**
 * Scope注解:作用域注解
 *   singleton: 单实例
 *   prototype: 多实例
 */
@Scope(value = "singleton")
@Controller
public class UserController {
}
