package com.cncf.controller.user;

import com.cncf.entity.Cms;
import com.cncf.response.ResponseData;
import com.cncf.service.CmsService;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author zj
 * @date 2017/10/30 13:29
 */
@Api(value = "CMS", description = "目前管理的标准（Current Management Standard）")
@Controller
@RequestMapping("/user/cms")
public class CmsController {
    @Autowired
    CmsService cmsService;

    @ApiOperation(value = "添加一个目前管理的标准", notes = "")
    @RequestMapping(value = "insertCms", method = {RequestMethod.POST})
    @ResponseBody
    public Cms insertCms(
            @ApiParam("标准的编号") @RequestParam("snumber") String snumber,
            @ApiParam("标准名称") @RequestParam("sname") String sname,
            @ApiParam("非委会ID") @RequestParam("btcid") Integer btcid){
        Cms cms=new Cms(); cms.setSnumber(snumber);
        cms.setSname(sname); cms.setBtcid(btcid);
        int res=cmsService.insertCms(cms);
        if (res==0){
            throw new RuntimeException("添加一个管理中的标准失败");
        }
        return cms;
    }

    @ApiOperation(value = "删除一个目前管理的标准", notes = "")
    @RequestMapping(value = "deleteCms", method = {RequestMethod.GET})
    @ResponseBody
    public ResponseData<Boolean> deleteCms(@ApiParam("要删除的标准的ID") @RequestParam("id") Integer id){
        ResponseData<Boolean> responseData=new ResponseData<>();
        int res=cmsService.deleteCms(id);
        if (res==0){
            responseData.jsonFill(2,"删除失败",false);
            return responseData;
        }
        responseData.jsonFill(1,"删除成功",true);
        return responseData;
    }

    @ApiOperation(value = "根据ID查询一个目前管理的标准", notes = "")
    @RequestMapping(value = "selectById", method = {RequestMethod.GET})
    @ResponseBody
    public ResponseData<Cms> selectById(@ApiParam("要查询的标准的ID") @RequestParam("id") Integer id){
        ResponseData<Cms> responseData=new ResponseData<>();
        Cms cms=cmsService.selectById(id);
        if (cms==null){
            responseData.jsonFill(2,"无效的id",null);
            return responseData;
        }
        responseData.jsonFill(1,null,cms);
        return responseData;
    }

    @ApiOperation(value = "根据分委会ID分页查询所有该分委会目前管理的标准", notes = "")
    @RequestMapping(value = "selectByBtcIdPage", method = {RequestMethod.GET})
    @ResponseBody
    public ResponseData<List<Cms>> selectByBtcIdPage(
            @ApiParam("分委会的ID") @RequestParam("btcid") Integer btcid,
            @ApiParam("当前页数") @RequestParam("page") int page,
            @ApiParam("页面大小") @RequestParam("pageSize") int pageSize){
        ResponseData<List<Cms>> responseData = new ResponseData<>();
        List<Cms> cmsList=cmsService.selectByBtcIdPage(btcid,page,pageSize);
        responseData.jsonFill(1, null, cmsList);
        responseData.setCount(cmsList.size());
        return responseData;
    }

    @ApiOperation(value = "更新目前管理的标准", notes = "")
    @RequestMapping(value = "updateCms", method = {RequestMethod.POST})
    @ResponseBody
    public ResponseData<Cms> updateCms(
            @ApiParam("要更新的标准的ID") @RequestParam("id") Integer id,
            @ApiParam("要更新的标准的编号") @RequestParam(value = "snumber",required = false) String snumber,
            @ApiParam("要更新的标准的名称") @RequestParam(value = "sname",required = false) String sname,
            @ApiParam("管理该标准的分委会的id") @RequestParam(value = "btcid",required = false) Integer btcid){
        ResponseData<Cms> responseData=new ResponseData<>();
        Cms cms=new Cms(); cms.setSnumber(snumber);
        cms.setSname(sname); cms.setBtcid(btcid); cms.setId(id);
        int res=cmsService.updateCms(cms);
        if (res==0){
            responseData.jsonFill(2,"更新失败",null);
            return responseData;
        }
        responseData.jsonFill(1,null,cms);
        return responseData;
    }

}
