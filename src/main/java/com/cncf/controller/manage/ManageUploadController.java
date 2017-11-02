package com.cncf.controller.manage;

import com.cncf.response.ResponseData;
import com.cncf.util.UploadFileUtil;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author zj
 * @date 2017/11/2 14:57
 */
@Api(value = "Upload", description = "")
@Controller
@RequestMapping("/manage/upload")
public class ManageUploadController {

    private static String ARTICLE_IMG_ROOT = "/article/img/";
    private static String ARTICLE_ATTACH_ROOT = "/article/attach/";

    @ApiOperation(value = "上传新闻图片", notes = "")
    @RequestMapping(value = "uploadNewsImg", method = {RequestMethod.POST})
    @ResponseBody
    public ResponseData<String> uploadNewsImg(@ApiParam("新闻图片") @RequestParam("img") MultipartFile img){
        ResponseData<String> responseData=new ResponseData<>();
        String imgUrl = UploadFileUtil.uploadFile(img,ARTICLE_IMG_ROOT);
        System.err.println(imgUrl);
        responseData.jsonFill(1,null,imgUrl);
        return responseData;
    }

    @ApiOperation(value = "上传新闻附件", notes = "")
    @RequestMapping(value = "uploadNewsAttach", method = {RequestMethod.POST})
    @ResponseBody
    public ResponseData<String> uploadNewsAttach(@ApiParam("其它附件") @RequestParam("attach") MultipartFile attach){
        ResponseData<String> responseData=new ResponseData<>();
        String attachUrl=UploadFileUtil.uploadFile(attach,ARTICLE_ATTACH_ROOT);
        System.err.println(attachUrl);
        responseData.jsonFill(1,null,attachUrl);
        return responseData;
    }

}
