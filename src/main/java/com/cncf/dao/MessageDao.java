package com.cncf.dao;

import com.cncf.entity.Message;
import com.cncf.entity.MessageSet;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageDao {
    boolean insertMessage(Message message);
    boolean updateValid(int id,int valid);
    Message selectMessageBySetId(int setId);
}
