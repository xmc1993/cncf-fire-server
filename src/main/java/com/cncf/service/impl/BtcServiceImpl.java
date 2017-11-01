package com.cncf.service.impl;

import com.cncf.dao.BtcDao;
import com.cncf.entity.Btc;
import com.cncf.service.BtcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zj
 * @date 2017/10/25 19:07
 */
@Service
public class BtcServiceImpl implements BtcService {
    @Autowired
    private BtcDao btcDao;

    @Override
    public boolean insertBtc(Btc btc) {
        return btcDao.insertBtc(btc);
    }

    @Override
    public List<Btc> selectAllBtc() {
        return btcDao.selectAllBtc();
    }

    @Override
    public Btc selectBtcById(Integer id) {
        return btcDao.selectBtcById(id);
    }

    @Override
    public boolean updateBtc(Btc btc) {
        return btcDao.updateBtc(btc);
    }

    @Override
    public boolean deleteBtc(Integer id) {
        return btcDao.deleteBtc(id);
    }
}
