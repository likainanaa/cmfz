package com.likainan.cmfz.controller;

import com.likainan.cmfz.entity.Article;
import com.likainan.cmfz.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by ASUS on 2018/7/8.
 */
@Controller
@RequestMapping("/article")
public class ArticleController {
    @Autowired
    private ArticleService articleService;
    @RequestMapping("/addArticle")
    @ResponseBody
    public int addArticle(Article article){
        int n=articleService.addArticle(article);
        if(n!=0){
            return  n;
        }
        return  0;
    }
}
