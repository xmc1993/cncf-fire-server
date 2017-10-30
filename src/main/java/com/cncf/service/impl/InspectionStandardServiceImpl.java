package com.cncf.service.impl;

import com.cncf.dao.InspectionStandardMapper;
import com.cncf.entity.InspectionStandard;
import com.cncf.entity.InspectionStandardExample;
import com.cncf.response.ResponseData;
import com.cncf.service.InspectionStandardService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zj
 * @date 2017/10/29 16:50
 */
/*
@Service
public class InspectionStandardServiceImpl implements InspectionStandardService {
    @Autowired
    InspectionStandardMapper inspectionStandardMapper;

    @Override
    public ResponseData<List<InspectionStandard>> selectByIdStatePage(Integer btcId, Integer state, int page, int pageSize) {
        ResponseData<List<InspectionStandard>> responseData=new ResponseData<>();
        InspectionStandardExample inspectionStandardExample=new InspectionStandardExample();

        //条件查询
        InspectionStandardExample.Criteria criteria=inspectionStandardExample.createCriteria();
        criteria.andBtcidEqualTo(btcId).andStateEqualTo(state);
        List<InspectionStandard> list= inspectionStandardMapper.selectByExample(inspectionStandardExample);

        //插件分页
        //PageHelper.startPage(page+1,pageSize);
        //PageInfo<InspectionStandard> pageInfo=new PageInfo<>(list);
        //int count=(int)pageInfo.getTotal();
        //responseData.setCount(count);

        //手工分页
        int offset = page*pageSize;
        int limit = pageSize;


        responseData.jsonFill(1,null,list);
        return responseData;
    }

}
*/
