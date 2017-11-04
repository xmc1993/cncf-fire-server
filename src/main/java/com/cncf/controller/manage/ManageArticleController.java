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

/**
 * @author zj
 */
@Api(value = "文章管理接口", description = "文章管理接口")
@Controller
@RequestMapping("/manage/article")
public class ManageArticleController {
    @Autowired
    private ArticleService articleService;
    @Autowired
    private CategoryService categoryService;

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

    @ApiOperation(value = "验证某一类型的文章是否存在",
            notes = "返回0则不存在，返回1则存在且只能存在一篇，返回2则可以添加多篇。只能有一篇文章的类型有：中心概况、法律地位、授权证书、法律地位、法律地位、地理位置")
    @RequestMapping(value = "articleIfExist", method = {RequestMethod.GET})
    @ResponseBody
    public ResponseData<Integer> articleIfExist(@ApiParam("文章类型ID") @RequestParam("id") Integer id){
        ResponseData<Integer> responseData=new ResponseData<>();
        Category category=categoryService.selectCategoryById(id);
        if (category==null){
            responseData.jsonFill(2,"无效的id",null);
            return responseData;
        }
        if ("中心概况".equals(category.getName())||"法律地位".equals(category.getName())||
                "授权证书".equals(category.getName())||"法律地位".equals(category.getName())||
                "法律地位".equals(category.getName())||"地理位置".equals(category.getName())){
            ResponseData<List<Article>> rd=articleService.selectArticleInfoByCategory(id);
            if (rd.getObj()==null){
                responseData.jsonFill(1,null,0);
                return responseData;
            }
            List<Article> articleList=rd.getObj();
            if (articleList.size()==1){
                responseData.jsonFill(1,null,1);
                return responseData;
            }
        }
        responseData.jsonFill(1,null,2);
        return responseData;
    }

    @ApiOperation(value = "插入文章", notes = "")
    @RequestMapping(value = "insertArticle", method = {RequestMethod.POST})
    @ResponseBody
    public ResponseData<Article> insertArticle(
            @ApiParam("文章标题") @RequestParam("title") String title,
            @ApiParam("文章来源") @RequestParam(value = "source",required = false) String source,
            @ApiParam("文章字号") @RequestParam(value = "wordSize" ,required = false) String wordSize,
            @ApiParam("文章类型") @RequestParam("categoryId") Integer categoryId,
            @ApiParam("文章正文") @RequestParam("content") String content,
            @ApiParam("图片URL") @RequestParam(value = "imgUrl",required = false) String imgUrl,
            @ApiParam("图片原名") @RequestParam(value = "imgName",required = false) String imgName,
            @ApiParam("附件URL") @RequestParam(value = "attachUrl",required = false) String attachUrl,
            @ApiParam("附件原名") @RequestParam(value = "attachName",required = false) String attachName,
            @ApiParam("是否置顶（1置顶，0不置顶）") @RequestParam(value = "isTop",required = false) Integer isTop,
            @ApiParam("是否标红（1标红，0不标红）") @RequestParam(value = "isRed",required = false) Integer isRed) {

        Article article=new Article();
        article.setTitle(title);
        article.setPublishTime(new Date());
        article.setClick(0);
        article.setSource(source);
        article.setWordSize(wordSize);
        article.setCategoryId(categoryId);
        article.setContent(content);
        article.setImgUrl(imgUrl);
        article.setImgName(imgName);
        article.setAttachUrl(attachUrl);
        article.setAttachName(attachName);
        article.setIsTop(isTop);
        article.setIsRed(isRed);

        ResponseData<Article> responseData = new ResponseData<>();
        boolean result = articleService.insertArticle(article);
        if (!result) {
            responseData.jsonFill(2, "文章发布失败", null);
            return responseData;
        }
        responseData.jsonFill(1, null, article);
        return responseData;
    }

    @ApiOperation(value = "更新文章", notes = "")
    @RequestMapping(value = "updateArticle", method = {RequestMethod.POST})
    @ResponseBody
    public ResponseData<Boolean> updateArticle(
            @ApiParam("文章ID") @RequestParam(value = "id") Integer id,
            @ApiParam("文章标题") @RequestParam(value = "title",required = false) String title,
            @ApiParam("来源") @RequestParam(value = "source",required = false) String source,
            @ApiParam("点击次数") @RequestParam(value = "click",required = false) Integer click,
            @ApiParam("字号") @RequestParam(value = "wordSize",required = false) String wordSize,
            @ApiParam("文章类型ID") @RequestParam(value = "categoryId",required = false) Integer categoryId,
            @ApiParam("文章内容") @RequestParam(value = "content",required = false) String content,
            @ApiParam("图片URL") @RequestParam(value = "imgUrl",required = false) String imgUrl,
            @ApiParam("图片原名") @RequestParam(value = "imgName",required = false) String imgName,
            @ApiParam("附件URL") @RequestParam(value = "attachUrl",required = false) String attachUrl,
            @ApiParam("附件原名") @RequestParam(value = "attachName",required = false) String attachName,
            @ApiParam("是否置顶（1置顶，0不置顶）") @RequestParam(value = "isTop",required = false) Integer isTop,
            @ApiParam("是否标红（1标红，0不标红）") @RequestParam(value = "isRed",required = false) Integer isRed
    ) {
        ResponseData<Boolean> responseData=new ResponseData<>();

        Article article=new Article(); article.setArticleId(id); article.setTitle(title);
        article.setSource(source); article.setClick(click); article.setWordSize(wordSize);
        article.setCategoryId(categoryId); article.setContent(content);
        article.setImgUrl(imgUrl); article.setImgName(imgName);
        article.setAttachUrl(attachUrl); article.setAttachName(attachName);
        article.setIsTop(isTop); article.setIsRed(isRed);

        boolean result = articleService.updateArticle(article);
        if (!result) {
            responseData.jsonFill(2, "更新失败", false);
            return responseData;
        }
        responseData.jsonFill(1, null, true);
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

    @ApiOperation(value = "根据ID获得文章", notes = "")
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

/*    @ApiOperation(value = "根据类型ID获得文章列表并分页显示", notes = "")
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
    }*/

/*    @ApiOperation(value = "根据类型获得文章简要信息列表并分页显示(不传类型id时查询所有文章简要信息,不传page和pageSize时不分页)", notes = "")
    @RequestMapping(value = "selectArticleInfoByCategoryIdAndPage", method = {RequestMethod.GET})
    @ResponseBody
    public ResponseData<List<Article>> selectArticleInfoByCategoryIdAndPage(
            @ApiParam("文章类型ID") @RequestParam(value = "categoryId",required = false) Integer categoryId,
            @ApiParam("当前页数") @RequestParam(value = "page",required = false) Integer page,
            @ApiParam("页面大小") @RequestParam(value = "pageSize",required = false) Integer pageSize) {
        return articleService.selectArticleInfoByCategoryAndPage(categoryId,page,pageSize);
    }*/

    @ApiOperation(value = "根据类型获得文章简要信息列表(不传类型id时查询所有文章简要信息)", notes = "")
    @RequestMapping(value = "selectArticleInfoByCategoryId", method = {RequestMethod.GET})
    @ResponseBody
    public ResponseData<List<Article>> selectArticleInfoByCategoryId(
            @ApiParam("文章类型ID") @RequestParam(value = "categoryId",required = false) Integer categoryId) {
        return articleService.selectArticleInfoByCategory(categoryId);
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

}
