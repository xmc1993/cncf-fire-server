package com.cncf.dao;

import com.cncf.entity.Admin;
import com.cncf.entity.Btcm;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author zj
 * @date 2017/10/27 3:37
 */
@Repository
public interface BtcmDao {
    Btcm getBtcmByCode(String code);
    List<Btcm> selectAllBtcmByPage(int page, int pageSize);
    boolean saveBtcm(Btcm btcm);
    boolean deleteBtcm(Integer id);
    boolean updateAccessToken(Btcm btcm);
    boolean updateBtcm(Btcm btcm);
}
