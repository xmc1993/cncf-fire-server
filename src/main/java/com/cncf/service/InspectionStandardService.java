package com.cncf.service;

import com.cncf.entity.InspectionStandard;
import com.cncf.entity.InspectionStandardExample;
import com.cncf.response.ResponseData;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InspectionStandardService {
    int countByExample(InspectionStandardExample example);

    int deleteByExample(InspectionStandardExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(InspectionStandard record);

    int insertSelective(InspectionStandard record);

    ResponseData<List<InspectionStandard>> selectByIdStatePage(Integer btcid, Integer state, int page, int pageSize);

    InspectionStandard selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") InspectionStandard record, @Param("example") InspectionStandardExample example);

    int updateByExample(@Param("record") InspectionStandard record, @Param("example") InspectionStandardExample example);

    int updateByPrimaryKeySelective(InspectionStandard record);

    int updateByPrimaryKey(InspectionStandard record);
}