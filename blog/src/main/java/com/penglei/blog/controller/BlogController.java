package com.penglei.blog.controller;

import com.penglei.blog.pojo.Article;
import com.penglei.blog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName BlogController
 * @Description controller
 * @date 2020-05-24 04:36
 */
@Controller
public class BlogController {

    @Autowired
    ArticleService articleService;

    @RequestMapping(value = "/index")
    /**
     * @Author ascetic
     * @Description 分页查询文章
     * @Date 06:56 2020-05-24
     * @Param [request, model]
     * @return java.lang.String
     **/
    public String queryBlogs(HttpServletRequest request,Model model){

        String page = request.getParameter("pageNum");
        Integer currentPage = page == null ? 0 :Integer.parseInt(page);

        // 设置分页参数
        PageRequest pageRequest = PageRequest.of(currentPage,2,Sort.by(Sort.Direction.DESC,new String[]{"created"}));

        Page<Article> articlePage = articleService.queryByPage(pageRequest);

        model.addAttribute("articles",articlePage);


        return "/client/index";
    }
}