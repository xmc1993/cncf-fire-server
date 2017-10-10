package com.cncf.controller;

import com.cncf.entity.Article;
import com.cncf.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("ArticleController")
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    @RequestMapping("deleteById")
    @ResponseBody
    public String deleteById(int id){
        boolean result=articleService.deleteById(id);
        if (result==false){
            return "删除失败";
        }
        return "删除成功";
    }

    @RequestMapping("insertArticle")
    @ResponseBody
    public String insertArticle(Article article){
        boolean result=articleService.insertArticle(article);
        if (result==false){
            return "发布失败";
        }
        return "发布成功";
    }

    @RequestMapping("selectTitleById")
    @ResponseBody
    public String selectTitleById(int id){
        String title=articleService.selectTitleById(id);
        return title;
    }

    @RequestMapping("selectByType")
    @ResponseBody
    public List selectByType(String type){
        List list=articleService.selectByType(type);
        return list;
    }

    @RequestMapping("updateTitleById")
    @ResponseBody
    public String updateTitleById(int id,String title){
        boolean result=articleService.updateTitleById(id,title);
        if (result==false){
            return "更新失败";
        }
        return "更新成功";
    }

    @RequestMapping("updateContentById")
    @ResponseBody
    public String updateContentById(int id,String content){
        boolean result=articleService.updateContentById(id,content);
        if (result==false){
            return "更新失败";
        }
        return "更新成功";
    }

    @RequestMapping("updateArticle")
    @ResponseBody
    public String updateArticle(Article article){
        boolean result=articleService.updateArticle(article);
        if (result==false){
            return "更新失败";
        }
        return "更新成功";
    }

}
