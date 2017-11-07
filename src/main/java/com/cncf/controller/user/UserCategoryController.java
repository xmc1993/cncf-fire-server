package com.cncf.controller.user;

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
@Api(value = "User", description = "用户端查看文章类型的接口")
@Controller
@RequestMapping("/user/category")
public class UserCategoryController {

    @Autowired
    private CategoryService categoryService;

    @ApiOperation(value = "获取所有的文章类型", notes = "")
    @RequestMapping(value = "selectAllCategory", method = {RequestMethod.GET})
    @ResponseBody
    public ResponseData<List<Category>> selectAllCategory(){
        List<Category> categoryList=categoryService.selectAllCategory();
        ResponseData<List<Category>> responseData = new ResponseData<>();
        if (categoryList.size()==0){
            responseData.jsonFill(2,"文章类型列表为空",null);
            return responseData;
        }
        responseData.jsonFill(1,"获取文章类型列表成功",categoryList);
        return responseData;
    }
}
