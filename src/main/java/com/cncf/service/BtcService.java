package com.cncf.service;

import com.cncf.entity.Btc;
import com.cncf.entity.BtcWithBLOBs;

import java.util.List;

/**
 * @author zj
 * @date 2017/10/25 18:41
 */
public interface BtcService {
    int insertBtc(BtcWithBLOBs btcWithBLOBs);
    List<Btc> selectAllBtc();
    BtcWithBLOBs selectBtcById(Integer id);
    int updateByPrimaryKeyWithBLOBs(BtcWithBLOBs btcWithBLOBs);
    int updateByPrimaryKeySelective(BtcWithBLOBs btcWithBLOBs);
    int deleteBtc(Integer id);
}
