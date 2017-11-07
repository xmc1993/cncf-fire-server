package com.cncf.service;

import com.cncf.entity.OperationLog;

import java.util.List;

public interface OperationLogService {

    OperationLog saveOperationLog(OperationLog operationLog);

    boolean deleteOperationLog(int id);

    OperationLog getOperationLogById(int id);

    List<OperationLog> getOperationLogListByPage(int page, int pageSize);

}
