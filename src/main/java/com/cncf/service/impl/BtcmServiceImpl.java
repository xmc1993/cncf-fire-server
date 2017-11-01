package com.cncf.service.impl;

import com.cncf.dao.BtcmDao;
import com.cncf.entity.Btcm;
import com.cncf.service.BtcmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zj
 * @date 2017/10/27 22:49
 */
@Service
public class BtcmServiceImpl implements BtcmService {
    @Autowired
    private BtcmDao btcmDao;

    @Override
    public Btcm getBtcmById(Integer id) {
        return btcmDao.getBtcmById(id);
    }

    @Override
    public Btcm getBtcmByCode(String code) {
        return btcmDao.getBtcmByCode(code);
    }

    @Override
    public List<Btcm> selectAllBtcmByPage(int page, int pageSize) {
        int offset = page*pageSize;
        int limit = pageSize;
        return btcmDao.selectAllBtcmByPage(offset,limit);
    }

    @Override
    public boolean saveBtcm(Btcm btcm) {
        return btcmDao.saveBtcm(btcm);
    }

    @Override
    public boolean deleteBtcm(Integer id) {
        return btcmDao.deleteBtcm(id);
    }

    @Override
    public boolean updateAccessToken(Btcm btcm) {
        return btcmDao.updateAccessToken(btcm);
    }

    @Override
    public boolean updateBtcm(Btcm btcm) {
        return btcmDao.updateBtcm(btcm);
    }
}
