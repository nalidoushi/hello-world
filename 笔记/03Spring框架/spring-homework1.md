[toc]

## Spring框架作业

### 作业1：

梳理课堂总结的笔记,包括:

* 第1个: **git-day01.pdf**
* 第2个: **maven-day01.pdf**
* 第3个: **spring-day01.pdf**
* 第4个: **注解大全**

### 作业2：

* 第1题：什么是 `IoC`  `IoC容器` 和 `依赖注入` ，请解释说明？
* 第2题：`IoC容器` 是如何实现的？
* 第3题：框架创建 `Spring Bean` 对象的方式有哪些？
* 第4题：说几个 `Spring` 中常用的注解并做简单说明？

### 作业3:

把之前的作业重做一遍,包括:

* **git-homework1.pdf**
* **maven-homework1.pdf**

### 作业4：

#### 1 eg1 练习

1. cn.tedu.spring下创建包 `eg1`，在包下创建学生类 `Student`，类属性如下：

   <font color=red>注意 set() 和 toString() 方法</font>

   学生姓名：name

   学生年龄：age

   学生性别：gender

2. 通过配置文件 `bean-student.xml` , 创建 `Bean` 对象并注入一组属性值；

3. 创建测试类 `TestStudent` 进行测试。

#### 2 eg2 练习

1. 在工程目录 `cn.tedu.spring` 下创建包 `eg2`；

2. 在 `eg2` 中创建商品类 `Product` ，属性包含：商品标题`title`、商品库存`num`、商品描述`comment`，

   将该类交由`spring`框架管理，并注入属性值（DI注入）,`title`和`num`在属性上, `comment`在`set`方法上注入；

3. 创建测试类 `TestProduct` ，进行 `Spring Bean` 对象的创建、依赖注入 及 `bean`对象的获取。

#### 3 eg3 练习

* 工程目录下 `cn.tedu.spring` 创建包 `eg3`；

* 创建接口：`Mapper`;

* 创建接口实现类：`MapperImpl1` ，并将此类交由 `Spring` 框架管理；

* 创建控制器类：`CommentMapper`，通过接口方式注入 `Mapper` 对象；

* 创建测试类  `TestMapper` ，进行 `Spring Bean` 对象的创建及依赖注入测试；

* 创建实现类 `MapperImpl2`，并将此类交由 `Spring` 框架管理，进行测试。

* 通过 `@Qualifier` 注解实现依赖注入.

#### 4 eg4 练习

创建包 `eg4`, 并创建类 `ShopController` ，请自行完成 `Spring Bean` 生命周期的每步验证。
