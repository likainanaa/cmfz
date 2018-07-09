package com.likainan.cmfz.service.impl;

import com.likainan.cmfz.dao.ArticleDao;
import com.likainan.cmfz.entity.Article;
import com.likainan.cmfz.service.ArticleService;
import com.likainan.cmfz.untils.GetUUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * Created by ASUS on 2018/7/8.
 */
@Service
@Transactional
public class ArticleServiceImpl implements ArticleService{
    @Autowired
    private  ArticleDao articleDao;
    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public int addArticle(Article article) {
        article.setArticleId(GetUUID.getUUID());
        article.setPublishDate(new Date());
        int n=articleDao.insertArticle(article);
        System.out.println(n);
        if(n!=0){
            return n;
        }
        return 0;

    }
}
