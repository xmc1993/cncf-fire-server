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
            @ApiParam("文章类型") @RequestParam("categoryId") Integer categoryId,
            @ApiParam("文章正文") @RequestParam("content") String content) {

        Article article=new Article(title,new Date(),source,0,wordSize,categoryId,content);
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

    @ApiOperation(value = "根据类型ID获得文章", notes =
            "1-中心概况；2-法律地位；3-授权证书；4-重点设备；5-地理位置；6-火灾报警产品；7-火灾防护产品；8-灭火设备产品；9-消防装备产品；10-非3C认证产品\n" +
                    "11-通知公告；12-图片新闻；13-行业动态；14-法律法规；15-一分委；16-二分委；17-三分委；18-八分委；19-ISO/TC21/SC6；20-文件下载")
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
