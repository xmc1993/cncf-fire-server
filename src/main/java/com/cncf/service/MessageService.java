package com.cncf.service;

import com.cncf.entity.Message;
import com.cncf.entity.MessageSet;

public interface MessageService {
    boolean insertMessage(Message message);
    boolean updateValid(int id,int valid);
    Message selectMessageBySetId(int setId);
}
