package com.cncf.controller.user;

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

/*    @ApiOperation(value = "根据类型获得文章简要信息列表并分页显示(用户端不能同时查看系统所有文章，因此调用此接口必须传类型id。不传page和pageSize时不分页)", notes = "")
    @RequestMapping(value = "selectArticleInfoByCategoryIdAndPage", method = {RequestMethod.GET})
    @ResponseBody
    public ResponseData<List<Article>> selectArticleInfoByCategoryIdAndPage(
            @ApiParam("文章类型ID") @RequestParam("categoryId") Integer categoryId,
            @ApiParam("当前页数") @RequestParam(value = "page",required = false) int page,
            @ApiParam("页面大小") @RequestParam(value = "pageSize",required = false) int pageSize) {
        return articleService.selectArticleInfoByCategoryAndPage(categoryId,page,pageSize);
    }*/

    @ApiOperation(value = "根据类型获得文章简要信息列表(用户端不能同时查看系统所有文章，因此调用此接口必须传类型id。)", notes = "")
    @RequestMapping(value = "selectArticleInfoByCategoryId", method = {RequestMethod.GET})
    @ResponseBody
    public ResponseData<List<Article>> selectArticleInfoByCategoryId(
            @ApiParam("文章类型ID") @RequestParam("categoryId") Integer categoryId) {
        ResponseData<List<Article>> responseData=new ResponseData<>();
        List<Article> articleList=articleService.selectArticleInfoByCategoryId(categoryId);
        responseData.jsonFill(1,null,articleList);
        return responseData;
    }

/*    @ApiOperation(value = "文件下载", notes = "文件下载模块")
    @RequestMapping(value = "fileDown", method = {RequestMethod.GET})
    @ResponseBody
    public void download(HttpServletRequest request, HttpServletResponse response) throws IOException, URISyntaxException, InterruptedException {
        articleService.download(request,response);
    }*/
}
