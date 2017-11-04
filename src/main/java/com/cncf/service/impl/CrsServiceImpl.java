package com.cncf.service.impl;

import com.cncf.dao.CrsMapper;
import com.cncf.entity.Cms;
import com.cncf.entity.Crs;
import com.cncf.service.CrsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zj
 * @date 2017/10/30 16:44
 */
@Service
public class CrsServiceImpl implements CrsService{
    @Autowired
    private CrsMapper crsMapper;


    @Override
    public List<Crs> selectByBtcIdPage(Integer btcid, int page, int pageSize) {
        int offset = page*pageSize;
        int limit = pageSize;
        List<Crs> crsList=crsMapper.selectByBtcIdPage(btcid,page,pageSize);
        return crsList;
    }

    @Override
    public Crs selectById(Integer id) {
        return crsMapper.selectByPrimaryKey(id);
    }

    @Override
    public int insertCrs(Crs crs) {
        return crsMapper.insert(crs);
    }

    @Override
    public int deleteCrs(Integer id) {
        return crsMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateCrs(Crs crs) {
        //return crsMapper.updateByPrimaryKeySelective(crs);
        return crsMapper.updateByPrimaryKey(crs);
    }
}
