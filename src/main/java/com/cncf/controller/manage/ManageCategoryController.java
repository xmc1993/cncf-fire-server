package com.cncf.controller.manage;


import com.cncf.entity.Category;
import com.cncf.response.ResponseData;
import com.cncf.service.CategoryService;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author zj
 */
@Api(value = "文章类型管理接口", description = "文章类型管理接口")
@Controller
@RequestMapping("/manage/category")
public class ManageCategoryController {

    @Autowired
    private CategoryService categoryService;

    @ApiOperation(value = "获取所有的文章类型", notes = "")
    @RequestMapping(value = "selectAllCategory", method = {RequestMethod.GET})
    @ResponseBody
    public ResponseData<List<Category>> selectAllCategory(){
        List<Category> categoryList=categoryService.selectAllCategory();
        ResponseData<List<Category>> responseData = new ResponseData<>();
        responseData.jsonFill(1,null,categoryList);
        return responseData;
    }
}
