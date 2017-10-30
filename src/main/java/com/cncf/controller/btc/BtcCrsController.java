package com.cncf.controller.btc;

import com.cncf.entity.Crs;
import com.cncf.entity.Crs;
import com.cncf.entity.Crs;
import com.cncf.entity.Crs;
import com.cncf.response.ResponseData;
import com.cncf.service.CrsService;
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
 * @date 2017/10/30 16:54
 */
@Api(value = "CRS", description = "技分委制修订中的标准")
@Controller
@RequestMapping("/btc/crs")
public class BtcCrsController {
    @Autowired
    private CrsService crsService;

    @ApiOperation(value = "添加一条制修订中的标准", notes = "")
    @RequestMapping(value = "insertCrs", method = {RequestMethod.POST})
    @ResponseBody
    public Crs insertCrs(
            @ApiParam("标准名称") @RequestParam("sname") String sname,
            @ApiParam("审核状态") @RequestParam("state") String state,
            @ApiParam("所属分委会ID") @RequestParam("btcid") Integer btcid){
        Crs crs=new Crs(); crs.setState(state);
        crs.setSname(sname); crs.setBtcid(btcid);
        int res=crsService.insertCrs(crs);
        if (res==0){
            throw new RuntimeException("添加失败");
        }
        return crs;
    }

    @ApiOperation(value = "删除一个制修订中的标准", notes = "")
    @RequestMapping(value = "deleteCrs", method = {RequestMethod.GET})
    @ResponseBody
    public ResponseData<Boolean> deleteCrs(@ApiParam("要删除的标准的ID") @RequestParam("id") Integer id){
        ResponseData<Boolean> responseData=new ResponseData<>();
        int res=crsService.deleteCrs(id);
        if (res==0){
            responseData.jsonFill(2,"删除失败",false);
            return responseData;
        }
        responseData.jsonFill(1,"删除成功",true);
        return responseData;
    }

    @ApiOperation(value = "根据ID查询制修订中的标准", notes = "")
    @RequestMapping(value = "selectById", method = {RequestMethod.GET})
    @ResponseBody
    public ResponseData<Crs> selectById(@ApiParam("要查询的标准的ID") @RequestParam("id") Integer id){
        ResponseData<Crs> responseData=new ResponseData<>();
        Crs crs=crsService.selectById(id);
        if (crs==null){
            responseData.jsonFill(2,"无效的id",null);
            return responseData;
        }
        responseData.jsonFill(1,null,crs);
        return responseData;
    }

    @ApiOperation(value = "根据分委会ID分页查询所有该分委会的制修订中的标准", notes = "")
    @RequestMapping(value = "selectByBtcIdPage", method = {RequestMethod.GET})
    @ResponseBody
    public ResponseData<List<Crs>> selectByBtcIdPage(
            @ApiParam("分委会的ID") @RequestParam("btcid") Integer btcid,
            @ApiParam("当前页数") @RequestParam("page") int page,
            @ApiParam("页面大小") @RequestParam("pageSize") int pageSize){
        ResponseData<List<Crs>> responseData = new ResponseData<>();
        List<Crs> crsList=crsService.selectByBtcIdPage(btcid,page,pageSize);
        responseData.jsonFill(1, null, crsList);
        responseData.setCount(crsList.size());
        return responseData;
    }

    @ApiOperation(value = "更新指定的制修订中的标准", notes = "")
    @RequestMapping(value = "updateCrs", method = {RequestMethod.POST})
    @ResponseBody
    public ResponseData<Crs> updateCrs(
            @ApiParam("要更新的标准的ID") @RequestParam("id") Integer id,
            @ApiParam("要更新的标准的名称") @RequestParam(value = "sname",required = false) String sname,
            @ApiParam("审核状态") @RequestParam(value = "snumber",required = false) String state,
            @ApiParam("管理该标准的分委会的id") @RequestParam(value = "btcid",required = false) Integer btcid){
        ResponseData<Crs> responseData=new ResponseData<>();
        Crs crs=new Crs(); crs.setState(state);
        crs.setSname(sname); crs.setBtcid(btcid); crs.setId(id);
        int res=crsService.updateCrs(crs);
        if (res==0){
            responseData.jsonFill(2,"更新失败",null);
            return responseData;
        }
        responseData.jsonFill(1,null,crs);
        return responseData;
    }
}
