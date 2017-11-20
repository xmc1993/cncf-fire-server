package com.cncf.service;

import com.cncf.entity.ReportFileInfo;
import com.cncf.response.ResponseData;

import java.util.List;

/**
 * @author zj
 */

public interface ReportFileInfoService {
    ResponseData<ReportFileInfo> selectReportFileInfoById(String id);
    ResponseData<List<ReportFileInfo>> selectAllReportFileInfoByPage(int page,int pageSize);
}
