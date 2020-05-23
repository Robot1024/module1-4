package com.penglei.blog.service;

import com.penglei.blog.pojo.Article;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * @author ascetic
 * @version 1.0
 * @InterfaceName ArticleService
 * @Description 查询服务接口
 * @date 2020-05-24 05:03
 */
public interface ArticleService {
    /**
     * @Author ascetic
     * @Description 通过分页查询
     * @Date 06:58 2020-05-24
     * @Param [pageRequest]
     * @return org.springframework.data.domain.Page<com.penglei.blog.pojo.Article>
     **/
    public Page<Article> queryByPage(PageRequest pageRequest);
}
