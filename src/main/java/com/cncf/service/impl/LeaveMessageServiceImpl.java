package com.cncf.service.impl;

import com.cncf.dao.LeaveMessageMapper;
import com.cncf.entity.*;
import com.cncf.service.LeaveMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zj
 */
@Service
public class LeaveMessageServiceImpl implements LeaveMessageService {
    @Autowired
    private LeaveMessageMapper leaveMessageMapper;

    @Override
    public int verifyLeaveMessage(Integer id, byte pass) {
        LeaveMessageWithBLOBs leaveMessageWithBLOBs=new LeaveMessageWithBLOBs();
        leaveMessageWithBLOBs.setId(id);
        leaveMessageWithBLOBs.setPass(pass);
        return leaveMessageMapper.updateByPrimaryKeySelective(leaveMessageWithBLOBs);
    }

    @Override
    public LeaveMessage selectLeaveMessageById(Integer id) {
        return leaveMessageMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<LeaveMessage> selectAllLeaveMessageByPage(int page, int pageSize) {
        int offset = page*pageSize;
        int limit = pageSize;
        return leaveMessageMapper.selectAllLeaveMessageByPage(offset,limit);
    }

    @Override
    public int insertLeaveMessage(LeaveMessageWithBLOBs leaveMessageWithBLOBs) {
        int res=leaveMessageMapper.insertSelective(leaveMessageWithBLOBs);
        return res;
    }

    @Override
    public int updateLeaveMessage(LeaveMessageWithBLOBs leaveMessageWithBLOBs) {
        return leaveMessageMapper.updateByPrimaryKeySelective(leaveMessageWithBLOBs);
    }
}
