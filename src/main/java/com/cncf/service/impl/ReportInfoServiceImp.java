package com.cncf.service.impl;

import com.cncf.dao.ReportInfoMapper;
import com.cncf.entity.ReportInfo;
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
    public ReportInfo selectReportInfoById(String id) {
        return reportInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<ReportInfo> selectAllReportInfoByPage(int page, int pageSize) {
        int offset = page*pageSize;
        int limit = pageSize;
        return reportInfoMapper.selectAllReportInfoByPage(offset,limit);
    }
}
