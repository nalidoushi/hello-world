-- 1. 创建库 **egdb2**，指定字符集为UTF8
CREATE DATABASE IF NOT EXISTS egdb2 CHARSET = UTF8;

-- 2. 切换库
USE egdb2;

-- 3. 创建表 **sanguo** 并指定字符集为UTF8，字段要求如下
--    - 英雄编号id：INT，主键自增长
--    - 英雄名称name：变长，字符宽度为30，不允许为空
--    - 性别gender：定长，字符宽度为1，不允许为空
--    - 国家country：定长，字符宽度为1，不允许为空
--    - 攻击力attack：INT，不允许为空
--    - 防御力defense：INT，不允许为空
CREATE TABLE IF NOT EXISTS sanguo
(
    id      INT PRIMARY KEY AUTO_INCREMENT,
    name    VARCHAR(30) NOT NULL,
    gender  CHAR(1)     NOT NULL,
    country CHAR(1)     NOT NULL,
    attack  INT         NOT NULL,
    defense INT         NOT NULL
) CHARSET = UTF8;
DESC sanguo;
-- 4.在表中插入数据
INSERT INTO sanguo
VALUES (1, '曹操', '男', '魏', 256, 63),
       (2, '张辽', '男', '魏', 328, 69),
       (3, '甄姬', '女', '魏', 168, 34),
       (4, '夏侯渊', '男', '魏', 366, 83),
       (5, '刘备', '男', '蜀', 220, 59),
       (6, '诸葛亮', '男', '蜀', 170, 54),
       (7, '赵云', '男', '蜀', 377, 66),
       (8, '张飞', '男', '蜀', 370, 80),
       (9, '孙尚香', '女', '蜀', 249, 62),
       (10, '大乔', '女', '吴', 190, 44),
       (11, '小乔', '女', '吴', 188, 39),
       (12, '周瑜', '男', '吴', 303, 60),
       (13, '吕蒙', '男', '吴', 330, 71);
SELECT * FROM sanguo;

-- 1. 查找所有蜀国人信息，按照攻击力排名
SELECT name,country,attack FROM sanguo
WHERE country='蜀'
ORDER BY attack DESC;
-- 2. 查找攻击力超过200[**包含200**]的魏国英雄名字和攻击力并显示为姓名， 攻击力
SELECT name,attack,country FROM sanguo
WHERE attack>=200 AND country='魏';
-- 3. 所有英雄按照攻击力降序排序，如果相同则按照防御升序排序
SELECT name,attack,defense FROM sanguo
ORDER BY attack DESC,defense ASC;
-- 4. 查找名字为3个字符的数据
SELECT name FROM sanguo
WHERE name LIKE '___';
-- 5. 找到魏国防御力排名2-3名的英雄
SELECT name,country,defense FROM sanguo
WHERE country='魏'
ORDER BY defense DESC
LIMIT 1,2;
-- 6. 找出表中的最大攻击力的值？
SELECT MAX(attack) max_attack FROM sanguo;
-- 7. 表中共有多少个英雄？
SELECT COUNT(*) FROM sanguo;
-- 8. 蜀国英雄中攻击值大于200[**包含200**]的英雄的数量
SELECT COUNT(*) FROM sanguo
WHERE country='蜀' AND attack>=200;
-- 9. 计算每个国家的平均攻击力
SELECT country,AVG(attack) FROM sanguo
GROUP BY country;
-- 10. 统计每个国家男性英雄和女性英雄的平均攻击力
-- 魏  男  xxx
-- 魏  女  xxx
-- 蜀  男  xxx
-- 蜀  女  xxx
SELECT country,gender,AVG(attack) FROM sanguo
GROUP BY country, gender;
-- 11. 所有国家的男英雄中 英雄数量最多的前2名的 国家名称及英雄数量
SELECT country,COUNT(*) number FROM sanguo
WHERE gender='男'
GROUP BY country
ORDER BY number DESC
LIMIT 0,2;

-- 12. 统计平均攻击力大于250[**包含250**]的国家的英雄数量
SELECT country,COUNT(*) number,AVG(attack) FROM sanguo
GROUP BY country
HAVING AVG(attack)>=250;
















