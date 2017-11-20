package com.cncf.service;

import com.cncf.entity.ReportInfo;
import com.cncf.entity.ReportInfoWithBLOBs;
import com.cncf.response.ResponseData;

import java.util.List;

/**
 * @author zj
 */

public interface ReportInfoService {
    ResponseData<ReportInfoWithBLOBs> selectReportInfoWithBLOBsById(String id);
    ResponseData<List<ReportInfoWithBLOBs>> selectAllReportInfoWithBLOBsByPage(int page, int pageSize);
}
