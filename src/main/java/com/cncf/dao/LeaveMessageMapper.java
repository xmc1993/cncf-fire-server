package com.cncf.dao;

import com.cncf.entity.LeaveMessage;
import com.cncf.entity.LeaveMessageExample;
import com.cncf.entity.LeaveMessageWithBLOBs;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface LeaveMessageMapper {
    int countByExample(LeaveMessageExample example);

    int deleteByExample(LeaveMessageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LeaveMessageWithBLOBs record);

    int insertSelective(LeaveMessageWithBLOBs record);

    List<LeaveMessageWithBLOBs> selectByExampleWithBLOBs(LeaveMessageExample example);

    List<LeaveMessage> selectByExample(LeaveMessageExample example);

    LeaveMessageWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LeaveMessageWithBLOBs record, @Param("example") LeaveMessageExample example);

    int updateByExampleWithBLOBs(@Param("record") LeaveMessageWithBLOBs record, @Param("example") LeaveMessageExample example);

    int updateByExample(@Param("record") LeaveMessage record, @Param("example") LeaveMessageExample example);

    int updateByPrimaryKeySelective(LeaveMessageWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(LeaveMessageWithBLOBs record);

    int updateByPrimaryKey(LeaveMessage record);

    List<LeaveMessage> selectAllLeaveMessageByPage(int offset,int limit);
}