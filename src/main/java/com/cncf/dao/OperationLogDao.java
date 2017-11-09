package com.cncf.dao;

import com.cncf.entity.OperationLog;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OperationLogDao {

    boolean saveOperationLog(OperationLog operationLog);

    boolean deleteOperationLog(int id);

    OperationLog getOperationLogById(int id);

    List<OperationLog> getOperationLogListByPage(int offset, int limit);

}
