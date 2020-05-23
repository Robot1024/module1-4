package com.penglei.blog.pojo;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "t_article")
public class Article {

    @Id //表明映射主键id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id; //文章id
    private String title; //文章标题
    private String content; //文章内容
    private Date created; //发表时间


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
