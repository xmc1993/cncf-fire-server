package com.cncf.service.impl;

import com.cncf.dao.ReportFileInfoMapper;
import com.cncf.entity.ReportFileInfo;
import com.cncf.response.ResponseData;
import com.cncf.service.ReportFileInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zj
 */
@Service
public class ReportFileInfoServiceImpl implements ReportFileInfoService {
    @Autowired
    private ReportFileInfoMapper reportFileInfoMapper;

    @Override
    public ResponseData<ReportFileInfo> selectReportFileInfoById(String id) {
        ResponseData<ReportFileInfo> responseData=new ResponseData<>();
        ReportFileInfo reportFileInfo=reportFileInfoMapper.selectByPrimaryKey(id);
        if (reportFileInfo==null){
            responseData.jsonFill(2,"无效的id",null);
            return responseData;
        }
        responseData.jsonFill(1,null,reportFileInfo);
        return responseData;
    }

    @Override
    public ResponseData<List<ReportFileInfo>> selectAllReportFileInfoByPage(int page, int pageSize) {
        int offset = page*pageSize;
        int limit = pageSize;
        ResponseData<List<ReportFileInfo>> responseData=new ResponseData<>();
        List<ReportFileInfo> reportFileInfoList=reportFileInfoMapper.selectAllReportFileInfoByPage(offset,limit);
        responseData.jsonFill(1,null,reportFileInfoList);
        responseData.setCount(reportFileInfoList.size());
        return responseData;
    }
}
