package com.cncf.controller.manage;

import com.cncf.entity.Article;
import com.cncf.response.ResponseData;
import com.cncf.service.ArticleService;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/manage/article")
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    @ApiOperation(value = "根据ID删除文章", notes = "")
    @RequestMapping(value = "deleteById", method = {RequestMethod.GET})
    @ResponseBody
    public ResponseData<String> deleteById(@ApiParam("文章ID") @RequestParam("id") int id) {
        ResponseData<String> responseData = new ResponseData<>();
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
    public ResponseData<String> insertArticle(
            @ApiParam("文章标题") @RequestParam("title") String title,
            @ApiParam("文章来源") @RequestParam("source") String source,
            @ApiParam("文章字号") @RequestParam("wordSize") String wordSize,
            @ApiParam("文章类型") @RequestParam("type") String type,
            @ApiParam("文章正文") @RequestParam("content") String content) {

        Article article=new Article(title,new Date(),source,0,wordSize,type,content);
        ResponseData<String> responseData = new ResponseData<>();
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
    public ResponseData<String> selectTitleById(@ApiParam("文章ID") @RequestParam("id") int id) {
        ResponseData<String> responseData = new ResponseData<>();

        String title = articleService.selectTitleById(id);
        responseData.jsonFill(1, null, title);
        return responseData;
    }

    @ApiOperation(value = "根据类型获得文章", notes = "")
    @RequestMapping(value = "selectArticleByTypeAndPage", method = {RequestMethod.GET})
    @ResponseBody
    public ResponseData<List> selectArticleByTypeAndPage(
            @ApiParam("文章类型") @RequestParam("type") String type,
            @ApiParam("当前页数") @RequestParam("page") int page,
            @ApiParam("页面大小") @RequestParam("pageSize") int pageSize) {
        ResponseData<List> responseData = new ResponseData<>();
        List articleList = articleService.selectArticleByTypeAndPage(type,page,pageSize);
        responseData.jsonFill(1, null, articleList);
        return responseData;
    }

    @ApiOperation(value = "更新文章标题", notes = "")
    @RequestMapping(value = "updateTitleById", method = {RequestMethod.POST})
    @ResponseBody
    public ResponseData<String> updateTitleById(@ApiParam("文章ID") @RequestParam("id") Integer id,
                                                @ApiParam("文章标题") @RequestParam("title") String title) {
        ResponseData<String> responseData = new ResponseData<>();

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
    public ResponseData<String> updateContentById(@ApiParam("文章ID") @RequestParam("id") Integer id,
                                                  @ApiParam("文章内容") @RequestParam("content") String content) {
        ResponseData<String> responseData = new ResponseData<>();

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
    public ResponseData<String> updateArticle(@ApiParam("文章类") @RequestParam("article") Article article) {
        ResponseData<String> responseData = new ResponseData<>();
        boolean result = articleService.updateArticle(article);
        if (!result) {
            responseData.jsonFill(2, "更新失败", null);
            return responseData;
        }
        responseData.jsonFill(1, null, "更新成功");
        return responseData;
    }

}
