package com.cncf.controller.user;

import com.cncf.entity.Article;
import com.cncf.entity.Category;
import com.cncf.response.ResponseData;
import com.cncf.service.ArticleService;
import com.cncf.service.CategoryService;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

@Controller
@RequestMapping("/user/article")
public class UserArticleController {
    @Autowired
    private ArticleService articleService;
    @Autowired
    private CategoryService categoryService;

/*    @ApiOperation(value = "根据类型获得文章简要信息列表并分页显示(用户端不能同时查看系统所有文章，因此调用此接口必须传类型id。不传page和pageSize时不分页)", notes = "")
    @RequestMapping(value = "selectArticleInfoByCategoryIdAndPage", method = {RequestMethod.GET})
    @ResponseBody
    public ResponseData<List<Article>> selectArticleInfoByCategoryIdAndPage(
            @ApiParam("文章类型ID") @RequestParam("categoryId") Integer categoryId,
            @ApiParam("当前页数") @RequestParam(value = "page",required = false) int page,
            @ApiParam("页面大小") @RequestParam(value = "pageSize",required = false) int pageSize) {
        return articleService.selectArticleInfoByCategoryAndPage(categoryId,page,pageSize);
    }*/

    @ApiOperation(value = "根据类型获得文章简要信息列表", notes = "用户端不能同时查看系统所有文章，因此调用此接口必须传类型id。")
    @RequestMapping(value = "selectArticleInfoByCategoryId", method = {RequestMethod.GET})
    @ResponseBody
    public ResponseData<List<Article>> selectArticleInfoByCategoryId(
            @ApiParam("文章类型ID") @RequestParam("categoryId") Integer categoryId) {
        ResponseData<List<Article>> responseData=new ResponseData<>();

        Category category=categoryService.selectCategoryById(categoryId);
        if (category==null){
            responseData.jsonFill(2,"无效的类型id",null);
            return responseData;
        }

        List<Article> articleList=articleService.selectArticleInfoByCategoryId(categoryId);
        responseData.jsonFill(1,null,articleList);
        return responseData;
    }

    @ApiOperation(value = "根据类型ID获得文章", notes = "该接口返回文章的全部内容，用于查询中心概括这类只有一篇的文章")
    @RequestMapping(value = "selectArticleByCategoryId", method = {RequestMethod.GET})
    @ResponseBody
    public ResponseData<List<Article>> selectArticleByCategoryId(
            @ApiParam("文章类型ID") @RequestParam("categoryId") Integer categoryId){
        ResponseData<List<Article>> responseData=new ResponseData<>();

        //验证该类型是否存在
        Category category=categoryService.selectCategoryById(categoryId);
        if (category==null){
            responseData.jsonFill(2,"无效的类型id",null);
            return responseData;
        }
        List<Article> articleList=articleService.selectArticleByCategoryId(categoryId);
        System.err.println(articleList.size());
        responseData.jsonFill(1,null,articleList);
        return responseData;
    }

    @ApiOperation(value = "根据ID获得文章简要信息", notes = "")
    @RequestMapping(value = "selectArticleInfoById", method = {RequestMethod.GET})
    @ResponseBody
    public ResponseData<Article> selectArticleInfoById(@ApiParam("文章ID") @RequestParam("id") Integer id) {
        ResponseData<Article> responseData = new ResponseData<>();
        Article article=articleService.selectArticleInfoById(id);
        if (article==null){
            responseData.jsonFill(2,"无效的id",null);
            return responseData;
        }
        responseData.jsonFill(1,null,article);
        return responseData;
    }

    @ApiOperation(value = "根据ID获得文章全部信息", notes = "")
    @RequestMapping(value = "selectArticleById", method = {RequestMethod.GET})
    @ResponseBody
    public ResponseData<Article> selectArticleById(@ApiParam("文章ID") @RequestParam("id") Integer id){
        ResponseData<Article> responseData = new ResponseData<>();
        Article article=articleService.selectArticleById(id);
        if (article==null){
            responseData.jsonFill(2,"无效的id",null);
            return responseData;
        }
        responseData.jsonFill(1,null,article);
        return responseData;
    }

}
