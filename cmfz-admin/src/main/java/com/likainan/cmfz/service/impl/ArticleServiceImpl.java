package com.likainan.cmfz.service.impl;

import com.likainan.cmfz.dao.ArticleDao;
import com.likainan.cmfz.entity.Article;
import com.likainan.cmfz.service.ArticleService;
import com.likainan.cmfz.untils.GetUUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

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
        int n=articleDao.insertArticle(article);
        if(n!=0){
            return n;
        }
        return 0;

    }
}
