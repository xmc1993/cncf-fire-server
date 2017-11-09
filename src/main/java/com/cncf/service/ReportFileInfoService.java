package com.cncf.service;

import com.cncf.entity.ReportFileInfo;

import java.util.List;

/**
 * @author zj
 */

public interface ReportFileInfoService {
    ReportFileInfo selectReportFileInfoById(String id);
    List<ReportFileInfo> selectAllReportFileInfoByPage(int page,int pageSize);
}
