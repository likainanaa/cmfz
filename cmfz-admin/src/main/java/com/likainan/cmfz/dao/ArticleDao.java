package com.likainan.cmfz.dao;

import com.likainan.cmfz.entity.Article;
import org.apache.ibatis.annotations.Param;

/**
 * Created by ASUS on 2018/7/8.
 */
public interface ArticleDao {
    int insertArticle(@Param("article") Article article);

}
