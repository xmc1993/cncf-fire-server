package com.cncf.service.impl;

import com.cncf.dao.BtcMapper;
import com.cncf.entity.Btc;
import com.cncf.entity.BtcExample;
import com.cncf.entity.BtcWithBLOBs;
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
    //@Autowired
    //private BtcDao btcDao;
    @Autowired
    private BtcMapper btcMapper;

    @Override
    public int insertBtc(BtcWithBLOBs btcWithBLOBs) {
        return btcMapper.insert(btcWithBLOBs);
    }

    @Override
    public List<Btc> selectAllBtc() {
        BtcExample btcExample=new BtcExample();
        return btcMapper.selectByExample(btcExample);
    }

    @Override
    public BtcWithBLOBs selectBtcById(Integer id) {
        return btcMapper.selectByPrimaryKey(id);
    }

    @Override //空值也插入
    public int updateByPrimaryKeyWithBLOBs(BtcWithBLOBs btcWithBLOBs) {
        return btcMapper.updateByPrimaryKeyWithBLOBs(btcWithBLOBs);
    }

    @Override
    public int updateByPrimaryKeySelective(BtcWithBLOBs btcWithBLOBs) {
        return btcMapper.updateByPrimaryKeySelective(btcWithBLOBs);
    }

    @Override
    public int deleteBtc(Integer id) {
        return btcMapper.deleteByPrimaryKey(id);
    }
}
