package com.cncf.service;

import com.cncf.entity.Btc;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author zj
 * @date 2017/10/25 18:41
 */
public interface BtcService {
    boolean insertBtc(Btc btc);
    List<Btc> selectAllBtc();
    Btc selectBtcById(Integer id);
    boolean updateBtc(Btc btc);
    boolean deleteBtc(Integer id);
}
