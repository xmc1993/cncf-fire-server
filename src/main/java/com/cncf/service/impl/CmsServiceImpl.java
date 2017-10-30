package com.cncf.service.impl;

import com.cncf.dao.CmsMapper;
import com.cncf.entity.Cms;
import com.cncf.service.CmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zj
 * @date 2017/10/30 13:02
 */
@Service
public class CmsServiceImpl implements CmsService{
    @Autowired
    private CmsMapper cmsMapper;

/*    @Override
    public ResponseData<List<Cms>> selectByBtcIdPage(Integer btcid, int page, int pageSize) {
        ResponseData<List<Cms>> responseData=new ResponseData<>();
        CmsExample cmsExample=new CmsExample();
        CmsExample.Criteria criteria=cmsExample.createCriteria();
        criteria.andBtcidEqualTo(btcid);
        List<Cms> cmsList= cmsMapper.selectByExample(cmsExample);

        //插件分页
        PageHelper.startPage(page+1,pageSize);
        PageInfo<Cms> pageInfo=new PageInfo<>(cmsList);
        int count=(int)pageInfo.getTotal();
        responseData.setCount(count);

        responseData.jsonFill(1,null,cmsList);
        return responseData;
    }*/

    @Override
    public List<Cms> selectByBtcIdPage(Integer btcid, int page, int pageSize) {
        int offset = page*pageSize;
        int limit = pageSize;
        List<Cms> cmsList=cmsMapper.selectByBtcIdPage(btcid,page,pageSize);
        return cmsList;
    }

    @Override
    public Cms selectById(Integer id) {
        return cmsMapper.selectByPrimaryKey(id);
    }

    @Override
    public int insertCms(Cms cms) {
        return cmsMapper.insertSelective(cms);
    }

    @Override
    public int deleteCms(Integer id) {
        return cmsMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateCms(Cms cms) {
        return cmsMapper.updateByPrimaryKeySelective(cms);
    }

}
