package com.cncf.service;

import com.cncf.entity.Message;
import com.cncf.entity.MessageSet;

import java.util.List;

public interface MessageSetService {
    boolean insertMessageSet(MessageSet messageSet);
    boolean updateValid(int id,int valid);
    List selectAllMessageSet();
}
