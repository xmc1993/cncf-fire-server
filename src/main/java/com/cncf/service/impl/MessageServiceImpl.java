package com.cncf.service.impl;

import com.cncf.dao.MessageDao;
import com.cncf.entity.Message;
import com.cncf.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl implements MessageService{
    @Autowired
    private MessageDao messageDao;

    public boolean insertMessage(Message message) {
        return messageDao.insertMessage(message);
    }

    public boolean updateMessageValid(int id, int valid) {
        return messageDao.updateMessageValid(id,valid);
    }

    public Message selectMessageBySetId(int setId) {
        return messageDao.selectMessageBySetId(setId);
    }

}
