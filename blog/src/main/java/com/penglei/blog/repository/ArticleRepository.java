package com.penglei.blog.repository;

import com.penglei.blog.pojo.Article;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author ascetic
 * @Description Dao
 * @Date 06:57 2020-05-24
 * @Param
 * @return
 **/
public interface ArticleRepository extends JpaRepository<Article,Integer> {
}
