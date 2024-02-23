package cn.tedu.spring.eg2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository
public class Product {
    //商品标题,商品库存,商品描述
    @Value("绝世好剑")
    private String title;
    @Value("1000")
    private Integer num;
    private String comment;

    @Value("步惊云的宝剑")
    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Product{" +
                "title='" + title + '\'' +
                ", num=" + num +
                ", comment='" + comment + '\'' +
                '}';
    }
}










