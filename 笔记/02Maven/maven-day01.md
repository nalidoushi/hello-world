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

  默认仓库: `Maven` 中央仓库[外网]

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

  