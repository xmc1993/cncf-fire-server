package com.cncf.service;

import com.cncf.entity.Btc;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author zj
 * @date 2017/10/25 18:41
 */
public interface BtcService {
    List<Btc> selectAllBtc();
    Btc selectBtcByModuleId(String moduleId);
    Btc selectBtcById(Integer id);
    boolean updateBtc(Btc btc);
}
