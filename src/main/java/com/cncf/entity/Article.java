package com.cncf.entity;

import lombok.Data;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.Date;

/**
 * @author zj
 */
@Data
public class Article {
    private Integer articleId;
    private String title;
    private Date publishTime;
    private String source;
    private Integer click;
    private String wordSize;
    private Integer categoryId;
    private String content;
    private String imgUrl;
    private String imgName;
    private String attachUrl;
    private String attachName;
    private Integer isTop;
    private Integer isRed;
    private Integer isRecommend;
}