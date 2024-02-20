[toc]

### 1 介绍

#### 1.1 课程介绍

* 总时长：15个工作日
* 课程内容：SSM框架
  * Git、Maven
  * Spring框架、Spring MVC框架、MyBatis框架
  * Knife4j、Lombok、JsonResult、拦截器、AOP...

#### 1.2 自我介绍

* 姓名：王伟超
* 邮箱：wangweichao@tedu.cn
* 微信：13603263409

### 2 项目开发流程

* 需求文档[产品经理]
* 原型图设计[设计]
* 数据库设计[数据架构师 - ER图]
* 前后端并行开发
  * 前端：Web前端工程师进行开发
  * 后端：Java开发工程师
    * 用户模块：注册、登录、第三方登录、忘记密码、修改密码... ...
    * 商品模块：首页展示、详情页、列表页... ...
    * 购物车模块
    * 订单模块
    * 支付模块
* 前后端联调
* 测试[测试工程师]
* 部署上线
* 运行维护,更新迭代

### 3 Git&Gitee&GitHub

<font color=red>**Git是版本控制工具，Gitee和GitHub则是基于Git的代码托管仓库.**</font>

- Git

  Git：免费的、开源的分布式版本控制系统.

- Gitee

  开源中国推出的基于Git的代码托管服务[<font color=red>**国内,稳定速度快**</font>].

- GitHub

  开源的代码托管平台[<font color=red>**外网,不稳定**</font>]

### 4 Git常用命令

<font color=red>**注意：首次安装使用git时，需要设置用户签名。**</font>

```java
git config --user.name 用户名[自定义]
git config --user.email 用户邮箱[自定义]
```

#### 4.1 基础命令

* 初始化本地仓库：`git init`

* 添加到暂存区：`git add 文件名`

* 提交到本地仓库：`git commit -m "提示消息" 文件名`

  <font color=red>**只有提交到本地仓库后，才会生成唯一的历史版本**</font>

* 查看本地仓库状态：`git status`

  未添加到暂存区的文件，颜色为：<font color=red>**红色**</font>

  添加到暂存区但未提交到本地仓库的文件，颜色为：<font color=green>**绿色**</font>

* 查看历史版本：`git reflog`

* 版本穿梭：`git reset --hard 历史版本号`

#### 4.2 分支命令

* 创建分支：`git branch 分支名`

* 查看分支：`git branch -v`

* 切换分支：`git checkout 分支名`

* 合并分支：`git merge 分支名`

  <font color=red>**注意：在合并之前首先要切换到合并到的分支，然后再执行合并分支的命令**</font>

* 合并冲突问题解决方案

  * 第1步：手动编辑有冲突的文件；
  * 第2步：添加到暂存区，并提交到本地仓库[<font color=red>**提交到本地仓库时commit命令不能加文件名**</font>]。



















