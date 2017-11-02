package com.cncf.controller.manage;

import com.cncf.entity.Article;
import com.cncf.entity.Category;
import com.cncf.response.ResponseData;
import com.cncf.service.ArticleService;
import com.cncf.service.CategoryService;
import com.cncf.util.UploadFileUtil;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Api(value = "文章管理接口", description = "文章管理接口")
@Controller
@RequestMapping("/manage/article")
public class ManageArticleController {
    @Autowired
    private ArticleService articleService;
    private static String ARTICLE_IMG_ROOT = "/article/img/";
    private static String ARTICLE_ATTACH_ROOT = "/article/attach/";

    @ApiOperation(value = "根据ID删除文章", notes = "")
    @RequestMapping(value = "deleteById/{articleId}", method = {RequestMethod.DELETE})
    @ResponseBody
    public ResponseData<Boolean> deleteById(@ApiParam("文章ID") @PathVariable Integer articleId) {
        ResponseData<Boolean> responseData = new ResponseData<>();
        System.err.println(articleId);
        boolean result = articleService.deleteById(articleId);
        if (!result) {
            responseData.jsonFill(2, "删除失败", false);
            return responseData;
        }
        responseData.jsonFill(1, "删除成功", true);
        return responseData;
    }

    @ApiOperation(value = "插入文章", notes = "")
    @RequestMapping(value = "insertArticle", method = {RequestMethod.POST})
    @ResponseBody
    public ResponseData<Article> insertArticle(
            @ApiParam("文章标题(不得多于100个字符/汉字)") @RequestParam("title") String title,
            @ApiParam("文章来源") @RequestParam(value = "source",required = false) String source,
            @ApiParam("文章字号") @RequestParam(value = "wordSize" ,required = false) String wordSize,
            @ApiParam("文章类型") @RequestParam("categoryId") Integer categoryId,
            @ApiParam("文章正文") @RequestParam("content") String content,
            @ApiParam("是否置顶") @RequestParam(value = "isTop",required = false) Integer isTop,
            @ApiParam("是否标红") @RequestParam(value = "isRed",required = false) Integer isRed,
            @ApiParam("图片URL") @RequestParam(value = "imgUrl",required = false) String imgUrl,
            @ApiParam("附件URL") @RequestParam(value = "attachUrl",required = false) String attachUrl) {

        Article article=new Article();
        article.setTitle(title); article.setPublishTime(new Date()); article.setSource(source);
        article.setClick(0); article.setWordSize(wordSize); article.setCategoryId(categoryId);
        article.setContent(content); article.setIsTop(isTop); article.setIsRed(isRed);
        article.setImgUrl(imgUrl); article.setAttachUrl(attachUrl);

        ResponseData<Article> responseData = new ResponseData<>();
        boolean result = articleService.insertArticle(article);
        if (!result) {
            responseData.jsonFill(2, "文章发布失败", null);
            return responseData;
        }
        responseData.jsonFill(1, null, article);
        return responseData;
    }

    @ApiOperation(value = "根据ID获得文章的标题", notes = "")
    @RequestMapping(value = "selectTitleById", method = {RequestMethod.GET})
    @ResponseBody
    public ResponseData<String> selectTitleById(@ApiParam("文章ID") @RequestParam("id") Integer id) {
        ResponseData<String> responseData = new ResponseData<>();

        String title = articleService.selectTitleById(id);
        responseData.jsonFill(1, null, title);
        return responseData;
    }

    @ApiOperation(value = "根据ID获得文章(不传id时获取所有文章)", notes = "")
    @RequestMapping(value = "selectArticle", method = {RequestMethod.GET})
    @ResponseBody
    public ResponseData<List<Article>> selectArticle(
            @ApiParam("文章ID") @RequestParam(value = "id",required = false) Integer id){
        ResponseData<List<Article>> responseData = new ResponseData<>();
        List<Article> articleList=new ArrayList<>();
        if (id!=null){
            Article article=articleService.selectArticleById(id);
            if (article==null){
                responseData.jsonFill(2,"无效的id",null);
                return responseData;
            }
            articleList.add(article);
            responseData.jsonFill(1,null,articleList);
            return responseData;
        }

        //id为空，查询所有文章
        articleList=articleService.selectAllArticle();
        responseData.jsonFill(2,null,articleList);
        return responseData;
    }

    @ApiOperation(value = "根据类型ID获得文章列表并分页显示", notes = "")
    @RequestMapping(value = "selectArticleByCategoryAndPage", method = {RequestMethod.GET})
    @ResponseBody
    public ResponseData<List> selectArticleByCategoryAndPage(
            @ApiParam("文章类型ID") @RequestParam("categoryId") Integer categoryId,
            @ApiParam("当前页数") @RequestParam("page") int page,
            @ApiParam("页面大小") @RequestParam("pageSize") int pageSize) {
        ResponseData<List> responseData = new ResponseData<>();
        List articleList = articleService.selectArticleByCategoryAndPage(categoryId,page,pageSize);
        responseData.jsonFill(1, null, articleList);
        responseData.setCount(articleList.size());
        return responseData;
    }

    @ApiOperation(value = "更新文章标题", notes = "")
    @RequestMapping(value = "updateTitleById", method = {RequestMethod.POST})
    @ResponseBody
    public ResponseData<Boolean> updateTitleById(@ApiParam("文章ID") @RequestParam("id") Integer id,
                                                @ApiParam("文章标题(不得多于100个字符/汉字)") @RequestParam("title") String title) {
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
            @ApiParam("文章标题(不得多于100个字符/汉字)") @RequestParam(value = "title",required = false) String title,
            @ApiParam("来源(不得多于100个字符/汉字)") @RequestParam(value = "source",required = false) String source,
            @ApiParam("点击次数") @RequestParam(value = "click",required = false) Integer click,
            @ApiParam("字号") @RequestParam(value = "wordSize",required = false) String wordSize,
            @ApiParam("文章类型ID") @RequestParam(value = "categoryId",required = false) Integer categoryId,
            @ApiParam("文章内容") @RequestParam(value = "content",required = false) String content,
            @ApiParam("是否置顶") @RequestParam(value = "isTop",required = false) Integer isTop,
            @ApiParam("是否标红") @RequestParam(value = "isRed",required = false) Integer isRed,
            @ApiParam("图片URL") @RequestParam(value = "imgUrl",required = false) String imgUrl,
            @ApiParam("附件URL") @RequestParam(value = "attachUrl",required = false) String attachUrl
            ) {
        ResponseData<Boolean> responseData=new ResponseData<>();

        Article article=new Article(); article.setArticleId(id); article.setTitle(title);
        article.setSource(source); article.setClick(click); article.setWordSize(wordSize);
        article.setCategoryId(categoryId); article.setContent(content);
        article.setIsTop(isTop); article.setIsRed(isRed);
        article.setImgUrl(imgUrl); article.setAttachUrl(attachUrl);

        boolean result = articleService.updateArticle(article);
        if (!result) {
            responseData.jsonFill(2, "更新失败", false);
            return responseData;
        }
        responseData.jsonFill(1, null, true);
        return responseData;
    }

}
