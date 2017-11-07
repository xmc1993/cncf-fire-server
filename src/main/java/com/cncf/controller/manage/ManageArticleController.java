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
import org.springframework.web.bind.annotation.*;

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
        Article article=articleService.selectArticleById(articleId);
        if (article==null){
            responseData.jsonFill(2,"无效的文章id",false);
            return responseData;
        }
        Integer categoryId=article.getCategoryId();
        ResponseData<Integer> rd= articleIfExistCommonByCategoryId(categoryId);
        Integer integer=rd.getObj();
        if (integer==null){
            responseData.jsonFill(2,"这篇文章的类型无效，考虑是否洗数据",false);
            return responseData;
        }
        if (integer==0){
            //这种情况不存在，因为如果文章篇数为0，一开始就会返回无效的文章id
        }
        if (integer==1){
            responseData.jsonFill(2,"该类文章篇数为1且必须为1，不允许删除",false);
            return responseData;
        }
        //下面就是integer==2的情况
        boolean result = articleService.deleteById(articleId);
        if (!result) {//第一个if已经验证过了文章是否存在
            responseData.jsonFill(2, "文章存在，但删除失败", false);
            return responseData;
        }
        responseData.jsonFill(1, "删除成功", true);
        return responseData;
    }


    public ResponseData<Integer> articleIfExistCommonByCategoryId(Integer id){
        ResponseData<Integer> responseData=new ResponseData<>();
        Category category=categoryService.selectCategoryById(id);
        if (category==null){
            responseData.jsonFill(2,"无效的类型id",null);
            return responseData;
        }
        if ("中心概况".equals(category.getName())||"法律地位".equals(category.getName())||
                "授权证书".equals(category.getName())||"法律地位".equals(category.getName())||
                "法律地位".equals(category.getName())||"地理位置".equals(category.getName())){
            List<Article> articleList=articleService.selectArticleInfoByCategoryId(id);
            if (articleList.size()==0){
                responseData.jsonFill(1,null,0);
                return responseData;
            }
            if (articleList.size()==1){
                responseData.jsonFill(1,null,1);
                return responseData;
            }
        }
        responseData.jsonFill(1,null,2);
        return responseData;
    }

    @ApiOperation(value = "验证某一类型的文章是否存在",
            notes = "返回0表示该类型文章只能有一篇，且目前篇数为0；" +
                    "返回1表示已存在且只能存在一篇；" +
                    "返回2表示可以添加多篇。" +
                    "只能有一篇文章的类型有：中心概况、法律地位、授权证书、法律地位、法律地位、地理位置")
    @RequestMapping(value = "articleIfExist", method = {RequestMethod.GET})
    @ResponseBody
    public ResponseData<Integer> articleIfExist(@ApiParam("文章类型ID") @RequestParam("id") Integer id){
        return articleIfExistCommonByCategoryId(id);
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
            @ApiParam("文章标题") @RequestParam(value = "title") String title,
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

    @ApiOperation(value = "根据类型获得文章简要信息列表", notes = "不传类型id时查询所有文章简要信息")
    @RequestMapping(value = "selectArticleInfoByCategoryId", method = {RequestMethod.GET})
    @ResponseBody
    public ResponseData<List<Article>> selectArticleInfoByCategoryId(
            @ApiParam("文章类型ID") @RequestParam(value = "categoryId",required = false) Integer categoryId) {
        ResponseData<List<Article>> responseData=new ResponseData<>();

        //验证该类型是否存在
        if (categoryId!=null){
            Category category=categoryService.selectCategoryById(categoryId);
            if (category==null){
                responseData.jsonFill(2,"无效的类型id",null);
                return responseData;
            }
        }

        List<Article> articleList=articleService.selectArticleInfoByCategoryId(categoryId);
        responseData.jsonFill(1,null,articleList);
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

}
