package com.cncf.dao;

import com.cncf.entity.Message;
import com.cncf.entity.MessageSet;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MessageSetDao {
    boolean insertMessageSet(MessageSet messageSet);
    boolean updateValid(int id,int valid);
    List selectAllMessageSet();
}
