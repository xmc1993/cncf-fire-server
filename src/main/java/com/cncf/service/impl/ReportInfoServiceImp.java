package com.cncf.service.impl;

import com.cncf.dao.ReportInfoMapper;
import com.cncf.entity.ReportInfo;
import com.cncf.entity.ReportInfoWithBLOBs;
import com.cncf.response.ResponseData;
import com.cncf.service.ReportInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zj
 */
@Service
public class ReportInfoServiceImp implements ReportInfoService{
    @Autowired
    private ReportInfoMapper reportInfoMapper;

    @Override
    public ResponseData<ReportInfoWithBLOBs> selectReportInfoWithBLOBsById(String id){
        ResponseData<ReportInfoWithBLOBs> responseData=new ResponseData<>();
        ReportInfoWithBLOBs reportInfoWithBLOBs=reportInfoMapper.selectByPrimaryKey(id);
        if (reportInfoWithBLOBs==null){
            responseData.jsonFill(2,"无效的id",null);
            return responseData;
        }
        responseData.jsonFill(1,null,reportInfoWithBLOBs);
        return responseData;
    }

    @Override
    public ResponseData<List<ReportInfoWithBLOBs>> selectAllReportInfoWithBLOBsByPage(int page, int pageSize) {
        ResponseData<List<ReportInfoWithBLOBs>> responseData=new ResponseData<>();
        int offset = page*pageSize;
        int limit = pageSize;
        List<ReportInfoWithBLOBs> reportInfoWithBLOBsList=reportInfoMapper.selectAllReportInfoWithBLOBsByPage(offset,limit);
        responseData.jsonFill(1,null,reportInfoWithBLOBsList);
        responseData.setCount(reportInfoWithBLOBsList.size());
        return responseData;
    }
}
