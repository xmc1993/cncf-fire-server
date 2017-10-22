package com.cncf.controller.user;

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

import java.util.List;

@Controller
@RequestMapping("/user/article")
public class UserArticleController {
    @Autowired
    private ArticleService articleService;

    @ApiOperation(value = "根据ID获得文章的标题", notes = "")
    @RequestMapping(value = "selectTitleById", method = {RequestMethod.GET})
    @ResponseBody
    public ResponseData<String> selectTitleById(@ApiParam("文章ID") @RequestParam("id") Integer id) {
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

}
