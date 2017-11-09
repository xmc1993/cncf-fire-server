package com.cncf.service.impl;

import com.cncf.dao.OperationLogDao;
import com.cncf.entity.OperationLog;
import com.cncf.service.OperationLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OperationLogServiceImpl implements OperationLogService {

    @Autowired
    private OperationLogDao operationLogDao;

    @Override
    public OperationLog saveOperationLog(OperationLog operationLog) {
        if (operationLogDao.saveOperationLog(operationLog)) {
            return operationLog;
        }
        return null;
    }

    @Override
    public boolean deleteOperationLog(int id) {
        return operationLogDao.deleteOperationLog(id);
    }

    @Override
    public OperationLog getOperationLogById(int id) {
        return operationLogDao.getOperationLogById(id);
    }

    @Override
    public List<OperationLog> getOperationLogListByPage(int page, int pageSize) {
        int offset = page*pageSize;
        int limit = pageSize;
        return operationLogDao.getOperationLogListByPage(offset, limit);
    }
}
