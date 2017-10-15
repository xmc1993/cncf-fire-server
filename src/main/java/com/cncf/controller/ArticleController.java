package com.cncf.controller;

import com.cncf.entity.Article;
import com.cncf.response.ResponseData;
import com.cncf.service.ArticleService;
import com.wordnik.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/manage/article")
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    @ApiOperation(value = "根据ID删除文章", notes = "")
    @RequestMapping("deleteById")
    @ResponseBody
    public ResponseData<String> deleteById(int id) {
        ResponseData<String> responseData = new ResponseData<String>();
        boolean result = articleService.deleteById(id);
        if (!result) {
            responseData.jsonFill(2, "删除失败", null);
            return responseData;
        }
        responseData.jsonFill(2, "删除成功", null);
        return responseData;
    }

    @ApiOperation(value = "插入文章", notes = "")
    @RequestMapping(value = "insertArticle", method = {RequestMethod.POST})
    @ResponseBody
    public ResponseData<String> insertArticle(Article article) {
        ResponseData<String> responseData = new ResponseData<String>();

        boolean result = articleService.insertArticle(article);
        if (!result) {
            responseData.jsonFill(2, "发布失败", null);
            return responseData;
        }
        responseData.jsonFill(1, null, "发布成功");
        return responseData;
    }

    @ApiOperation(value = "根据ID获得文章的标题", notes = "")
    @RequestMapping(value = "selectTitleById", method = {RequestMethod.GET})
    @ResponseBody
    public ResponseData<String> selectTitleById(int id) {
        ResponseData<String> responseData = new ResponseData<String>();

        String title = articleService.selectTitleById(id);
        responseData.jsonFill(1, null, title);
        return responseData;
    }

    @ApiOperation(value = "根据类型获得文章", notes = "")
    @RequestMapping(value = "selectByType", method = {RequestMethod.GET})
    @ResponseBody
    public ResponseData<List> selectByType(String type) {
        ResponseData<List> responseData = new ResponseData<List>();
        List list = articleService.selectByType(type);
        responseData.jsonFill(1, null, list);
        return responseData;
    }

    @ApiOperation(value = "更新文章标题", notes = "")
    @RequestMapping(value = "updateTitleById", method = {RequestMethod.POST})
    @ResponseBody
    public ResponseData<String> updateTitleById(int id, String title) {
        ResponseData<String> responseData = new ResponseData<String>();

        boolean result = articleService.updateTitleById(id, title);
        if (!result) {
            responseData.jsonFill(2, "更新失败", null);
            return responseData;
        }
        responseData.jsonFill(1, null, "更新成功");
        return responseData;
    }

    @ApiOperation(value = "更新文章内容", notes = "")
    @RequestMapping(value = "updateContentById", method = {RequestMethod.POST})
    @ResponseBody
    public ResponseData<String> updateContentById(int id, String content) {
        ResponseData<String> responseData = new ResponseData<String>();

        boolean result = articleService.updateContentById(id, content);
        if (!result) {
            responseData.jsonFill(2, "更新失败", null);
            return responseData;
        }
        responseData.jsonFill(1, null, "更新成功");
        return responseData;
    }

    @ApiOperation(value = "更新文章", notes = "")
    @RequestMapping(value = "updateArticle", method = {RequestMethod.POST})
    @ResponseBody
    public ResponseData<String> updateArticle(Article article) {
        ResponseData<String> responseData = new ResponseData<String>();
        boolean result = articleService.updateArticle(article);
        if (!result) {
            responseData.jsonFill(2, "更新失败", null);
            return responseData;
        }
        responseData.jsonFill(1, null, "更新成功");
        return responseData;
    }

}
