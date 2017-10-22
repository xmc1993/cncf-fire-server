package com.cncf.service;

import com.cncf.entity.Message;
import com.cncf.entity.MessageSet;

import java.util.List;

public interface MessageSetService {
    MessageSet insertMessageSet(MessageSet messageSet);
    boolean updateMessageSetValid(int id, int valid);
    List selectAllMessageSet(int page,int pageSize);
}
