package com.cncf.service;

import com.cncf.entity.LeaveMessage;
import com.cncf.entity.LeaveMessageWithBLOBs;

import java.util.List;

/**
 * @author zj
 */

public interface LeaveMessageService {
    /**
     * @param id
     * @param pass
     * @return
     */
    int verifyLeaveMessage(Integer id,byte pass);
    LeaveMessage selectLeaveMessageById(Integer id);
    List<LeaveMessage> selectAllLeaveMessageByPage(int page,int pageSize);
    int insertLeaveMessage(LeaveMessageWithBLOBs leaveMessageWithBLOBs);
    int updateLeaveMessage(LeaveMessageWithBLOBs leaveMessageWithBLOBs);
}
