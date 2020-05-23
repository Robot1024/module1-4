package com.penglei.blog.service.impl;

import com.penglei.blog.pojo.Article;
import com.penglei.blog.repository.ArticleRepository;
import com.penglei.blog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName ArticleServiceImpl
 * @Description TODO
 * @date 2020-05-24 05:05
 */
@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleRepository articleRepository;

    @Override
    public Page<Article> queryByPage(PageRequest pageRequest) {

        return articleRepository.findAll(pageRequest);
    }
}