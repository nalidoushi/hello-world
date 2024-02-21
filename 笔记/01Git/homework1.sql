-- 1. 创建库 **egdb1** 并指定字符集为UTF8
CREATE DATABASE IF NOT EXISTS egdb1 CHARSET = UTF8;

-- 2. 查看所有的库
SHOW DATABASES;

-- 3. 切换到库 **egdb1**
USE egdb1;

-- 4. 在该库中创建数据表 **books** 并指定字符集为UTF8，字段类型和约束要求如下：
--    - 书籍编号id：整型，设置为主键并设置自增长属性
--    - 书籍名称bname：变长，宽度为50，不能为NULL
--    - 书籍作者author：变长，宽度为30，不能为NULL，设置默认值为 '佚名'
--    - 书籍出版社press：变长，宽度为128
--    - 书籍价格price：浮点型，总位数为7，小数位为2，不能为NULL，设置默认值为 0.00
--    - 书籍描述comment：text类型，不用指定宽度
CREATE TABLE IF NOT EXISTS books
(
    id      INT PRIMARY KEY AUTO_INCREMENT COMMENT '书籍编号',
    bname   VARCHAR(50)  NOT NULL COMMENT '书籍名称',
    author  VARCHAR(30)  NOT NULL DEFAULT '佚名' COMMENT '书籍作者',
    press   VARCHAR(128) COMMENT '出版社',
    price   DOUBLE(7, 2) NOT NULL DEFAULT 0.00 COMMENT '书籍价格',
    comment TEXT COMMENT '书籍描述'
) CHARSET = UTF8;

-- 5. 查看表结构
DESC books;

-- 6. 在表中任意插入1条表记录；
INSERT INTO books(bname, author, press, price, comment)
VALUES ('花千骨', '赵丽颖', '北京大学出版社', 99.99, '真好看');

-- 7. 查询所有表记录；
SELECT *
FROM books;

-- 8. 在表中批量插入表记录
INSERT INTO books(bname, author, press, price, comment)
VALUES ('边城', '沈从文', '机械工业出版社', 36, '小城故事多'),
       ('骆驼祥子', '老舍', '机械工业出版社', 43, '你是祥子么'),
       ('茶馆', '老舍', '中国文学出版社', 55, '老北京'),
       ('呐喊', '鲁迅', '人民教育出版社', 71, '最后的声音'),
       ('朝花夕拾', '鲁迅', '中国文学出版社', 53, '好时光'),
       ('围城', '钱钟书', '中国文学出版社', 44, '你心中的围城是什么');

INSERT INTO books(bname, author, press, price)
VALUES ('林家铺子', '茅盾', '机械工业出版社', 51),
       ('子夜', '茅盾', '人民教育出版社', 47);

-- 1. 查找人民教育出版社出版的图书
SELECT bname,author,press FROM books WHERE press='人民教育出版社';

-- 2. 查找老舍写的，中国文学出版社出版的图书
SELECT bname, author, press FROM books WHERE author='老舍' AND press='中国文学出版社';

-- 3. 查找价格超过60元[**不包括60元**]的图书，只看书名和价格
SELECT bname, price FROM books WHERE price>60;

-- 4. 将呐喊的价格修改为45元
UPDATE books SET price=45 WHERE bname='呐喊';

-- 5. 增加一个字段出版时间，类型为 date ，放在价格字段price后面
ALTER TABLE books ADD publish_time DATE AFTER price;
DESC books;

-- 6. 修改所有老舍的作品出版时间为 2018-10-01
UPDATE books SET publish_time='2018-10-01' WHERE author='老舍';

-- 7. 所有鲁迅的图书价格增加5元
UPDATE books SET price=price+5 WHERE author='鲁迅';

-- 8. 删除所有价格超过70元[**包含70元**]或者不到40元[**不包含40元**]的图书
DELETE FROM books WHERE price>=70 OR price<40;
SELECT * FROM books;
