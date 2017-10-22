package com.cncf.service.impl;

import com.cncf.dao.MessageSetDao;
import com.cncf.entity.MessageSet;
import com.cncf.service.MessageSetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageSetServiceImpl implements MessageSetService{

    @Autowired
    private MessageSetDao messageSetDao;

    public MessageSet insertMessageSet(MessageSet messageSet) {
        if (messageSetDao.insertMessageSet(messageSet)){
            return messageSet;
        }
        return null;
    }

    public boolean updateMessageSetValid(int id, int valid) {
        return messageSetDao.updateMessageSetValid(id,valid);
    }

    public List selectAllMessageSet(int page,int pageSize) {
        int offset = page*pageSize;
        int limit = pageSize;
        return messageSetDao.selectAllMessageSet(offset,limit);
    }

}
