package com.cncf.service;

import com.cncf.entity.Crs;

import java.util.List;

/**
 * @author zj
 * @date 2017/10/30 16:19
 */
public interface CrsService {
    List<Crs> selectByBtcIdPage(Integer btcid, int page, int pageSize);
    Crs selectById(Integer id);
    int insertCrs(Crs crs);
    int deleteCrs(Integer id);
    int updateCrs(Crs crs);
    
}
