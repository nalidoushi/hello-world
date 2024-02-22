[toc]

### 1 什么是Maven

- Maven是 Apache 下的一个 Java 开发的开源项目，是一个 <font color=red>**项目构建和管理的工具。**</font>
- Maven可以方便的编译代码、进行依赖管理等等。

### 2 Maven的目录结构

```java
根目录：工程名
|---src：//源码
|---|---main: //存放主程序
|---|---|---java： //源码文件
|---|---|---resources： //存放框架的资源文件
|---|---test：//存放测试程序
|---|---|---java: //java测试文件
|---|---|---resources: //java测试的资源文件
|---pom.xml：//maven的核心配置文件
```

### 3 Maven相关配置

<font color=red>**操作文件：settings.xml**</font>

- **配置本地仓库路径**

  默认存放路径: 用户主目录 `/.m2/repository/`

  ```xml
  <localRepository>E:/software/repository</localRepository>
  ```

- **配置阿里镜像库**

  默认仓库: `Maven` 中央仓库[<font color=red>外网</font>]

  ```xml
  <mirrors>
      <mirror>
          <id>ali</id>
          <name>ali Maven</name>
          <mirrorOf>*</mirrorOf>
          <url>https://maven.aliyun.com/repository/public/</url>
      </mirror>
  </mirrors>
  ```


### 4 仓库

* 本地仓库
* 远程仓库
  * Maven中央仓库: 外网
  * 阿里镜像库: 国内
  * 私服: 公司内部搭建的服务器

### 5 Maven坐标

#### 5.1 什么是Maven坐标？

Maven的坐标是用来唯一标识一个项目或构件的信息

#### 5.2 Maven坐标的组成

坐标主要由三部分组成：groupId、artifactId和version。

- groupId定义当前Maven项目隶属组织名称（通常是域名反写，例如：cn.tedu）；
- artifactId定义当前Maven项目名称（通常是模块名称，例如order-service，goods-service）；
- version定义当前项目版本号

#### 5.3 Maven坐标示例

```xml
<dependecies>
    <dependency>
        <groupId>mysql</groupId>
        <artifactId>mysql-connector-java</artifactId>
        <version>8.0.31</version>
    </dependency>
</dependecies>
```

### 6 重要网址

- <font color=red>**Maven中央仓库地址**</font>：https://mvnrepository.com/
- Maven仓库资源地址：https://repo1.maven.org/maven2/

### 7 Maven命令

| 命令             | 作用                                                         |
| ---------------- | ------------------------------------------------------------ |
| mvn compile      | 编译主程序 `src/main`，生成target目录， 存放编译主程序生成的字节码文件，输出到 `target/classes` |
| mvn test-compile | 编译测试程序 `src/test`，生成target目录， 存放编译测试程序生成的字节码文件，输出到`target/test-classes` |
| mvn test         | 编写的测试代码并生成测试报告(目前对于后端开发没有太大作用)   |
| mvn package      | 将项目打成jar包                                              |
| mvn clean        | 清空项目本地编译目录                                         |







