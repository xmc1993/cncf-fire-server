package com.cncf.service.impl;

import com.cncf.dao.ReportFileInfoMapper;
import com.cncf.entity.ReportFileInfo;
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
    public ReportFileInfo selectReportFileInfoById(String id) {
        return reportFileInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<ReportFileInfo> selectAllReportFileInfoByPage(int page, int pageSize) {
        int offset = page*pageSize;
        int limit = pageSize;
        return reportFileInfoMapper.selectAllReportFileInfoByPage(offset,limit);
    }
}
