package dao;

import com.cncf.entity.LeaveMessage;

public interface LeaveMessageMapper {
    int deleteByPrimaryKey(Integer leaveid);

    int insert(LeaveMessage record);

    int insertSelective(LeaveMessage record);

    LeaveMessage selectByPrimaryKey(Integer leaveid);

    int updateByPrimaryKeySelective(LeaveMessage record);

    int updateByPrimaryKey(LeaveMessage record);
}