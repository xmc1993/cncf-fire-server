package com.cncf.service;

import com.cncf.entity.ReportInfo;

import java.util.List;

/**
 * @author zj
 */

public interface ReportInfoService {
    ReportInfo selectReportInfoById(String id);
    List<ReportInfo> selectAllReportInfoByPage(int page,int pageSize);
}
