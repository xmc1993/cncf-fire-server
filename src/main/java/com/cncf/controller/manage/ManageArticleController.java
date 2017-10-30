package com.cncf.controller.manage;

import com.cncf.entity.Article;
import com.cncf.entity.Category;
import com.cncf.response.ResponseData;
import com.cncf.service.ArticleService;
import com.cncf.service.CategoryService;
import com.wordnik.swagger.annotations.Api;
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

@Api(value = "文章管理接口", description = "文章管理接口")
@Controller
@RequestMapping("/manage/article")
public class ManageArticleController {
    @Autowired
    private ArticleService articleService;

    @ApiOperation(value = "根据ID删除文章", notes = "")
    @RequestMapping(value = "deleteById", method = {RequestMethod.GET})
    @ResponseBody
    public ResponseData<Boolean> deleteById(@ApiParam("文章ID") @RequestParam("id") int id) {
        ResponseData<Boolean> responseData = new ResponseData<>();
        boolean result = articleService.deleteById(id);
        if (!result) {
            responseData.jsonFill(2, "删除失败", false);
            return responseData;
        }
        responseData.jsonFill(2, "删除成功", true);
        return responseData;
    }

    @ApiOperation(value = "插入文章", notes = "")
    @RequestMapping(value = "insertArticle", method = {RequestMethod.POST})
    @ResponseBody
    public ResponseData<Article> insertArticle(
            @ApiParam("文章标题") @RequestParam("title") String title,
            @ApiParam("文章来源") @RequestParam("source") String source,
            @ApiParam("文章字号") @RequestParam("wordSize") String wordSize,
            @ApiParam("文章类型") @RequestParam("categoryId") Integer categoryId,
            @ApiParam("文章正文") @RequestParam("content") String content) {

        Article article=new Article(title,new Date(),source,0,wordSize,categoryId,content);
        ResponseData<Article> responseData = new ResponseData<>();
        boolean result = articleService.insertArticle(article);
        if (!result) {
            responseData.jsonFill(2, "发布失败", null);
            return responseData;
        }
        responseData.jsonFill(1, null, article);
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

    @ApiOperation(value = "根据类型ID获得文章", notes = "")
    @RequestMapping(value = "selectArticleByCategoryAndPage", method = {RequestMethod.GET})
    @ResponseBody
    public ResponseData<List> selectArticleByCategoryAndPage(
            @ApiParam("文章类型ID") @RequestParam("categoryId") Integer categoryId,
            @ApiParam("当前页数") @RequestParam("page") int page,
            @ApiParam("页面大小") @RequestParam("pageSize") int pageSize) {
        ResponseData<List> responseData = new ResponseData<>();
        List articleList = articleService.selectArticleByCategoryAndPage(categoryId,page,pageSize);
        responseData.jsonFill(1, null, articleList);
        return responseData;
    }

    @ApiOperation(value = "更新文章标题", notes = "")
    @RequestMapping(value = "updateTitleById", method = {RequestMethod.POST})
    @ResponseBody
    public ResponseData<Boolean> updateTitleById(@ApiParam("文章ID") @RequestParam("id") Integer id,
                                                @ApiParam("文章标题") @RequestParam("title") String title) {
        ResponseData<Boolean> responseData = new ResponseData<>();

        boolean result = articleService.updateTitleById(id, title);
        if (!result) {
            responseData.jsonFill(2, "更新失败", false);
            return responseData;
        }
        responseData.jsonFill(1, null, true);
        return responseData;
    }

    @ApiOperation(value = "更新文章内容", notes = "")
    @RequestMapping(value = "updateContentById", method = {RequestMethod.POST})
    @ResponseBody
    public ResponseData<Boolean> updateContentById(@ApiParam("文章ID") @RequestParam("id") Integer id,
                                                  @ApiParam("文章内容") @RequestParam("content") String content) {
        ResponseData<Boolean> responseData = new ResponseData<>();
        boolean result = articleService.updateContentById(id, content);
        if (!result) {
            responseData.jsonFill(2, "更新失败", false);
            return responseData;
        }
        responseData.jsonFill(1, null,true);
        return responseData;
    }

    @ApiOperation(value = "更新文章", notes = "")
    @RequestMapping(value = "updateArticle", method = {RequestMethod.POST})
    @ResponseBody
    public ResponseData<Boolean> updateArticle(
            @ApiParam("文章ID") @RequestParam(value = "id") Integer id,
            @ApiParam("文章标题") @RequestParam(value = "title",required = false) String title,
            @ApiParam("文章发布时间") @RequestParam(value = "publishTime",required = false) String publishTime,
            @ApiParam("来源") @RequestParam(value = "source",required = false) String source,
            @ApiParam("点击次数") @RequestParam(value = "click",required = false) String click,
            @ApiParam("字号") @RequestParam(value = "wordSize",required = false) String wordSize,
            @ApiParam("文章类型ID") @RequestParam(value = "categoryId",required = false) String categoryId,
            @ApiParam("文章内容") @RequestParam(value = "content",required = false) String content
            ) {
        ResponseData<Boolean> responseData=new ResponseData<>();
        Article article=new Article();
        article.setArticleId(id);

        boolean result = articleService.updateArticle(article);
        if (!result) {
            responseData.jsonFill(2, "更新失败", false);
            return responseData;
        }
        responseData.jsonFill(1, null, true);
        return responseData;
    }

}
