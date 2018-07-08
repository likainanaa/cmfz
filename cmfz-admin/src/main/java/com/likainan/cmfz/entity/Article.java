package com.likainan.cmfz.entity;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by ASUS on 2018/7/8.
 */
@Component
public class Article implements Serializable{
    private  String  articleId;
    private  String  articleName;
    private  String  guruId;
    private  String  introduction;
    private  String  articlePic;
    private  Date publishDate;

    public Article() {
    }

    public Article(String articleId, String articleName, String guruId, String introduction, String articlePic, Date publishDate) {
        this.articleId = articleId;
        this.articleName = articleName;
        this.guruId = guruId;
        this.introduction = introduction;
        this.articlePic = articlePic;
        this.publishDate = publishDate;
    }

    public String getArticleId() {
        return articleId;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId;
    }

    public String getArticleName() {
        return articleName;
    }

    public void setArticleName(String articleName) {
        this.articleName = articleName;
    }

    public String getGuruId() {
        return guruId;
    }

    public void setGuruId(String guruId) {
        this.guruId = guruId;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getArticlePic() {
        return articlePic;
    }

    public void setArticlePic(String articlePic) {
        this.articlePic = articlePic;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    @Override
    public String toString() {
        return "Article{" +
                "articleId='" + articleId + '\'' +
                ", articleName='" + articleName + '\'' +
                ", guruId='" + guruId + '\'' +
                ", introduction='" + introduction + '\'' +
                ", articlePic='" + articlePic + '\'' +
                ", publishDate=" + publishDate +
                '}';
    }
}
