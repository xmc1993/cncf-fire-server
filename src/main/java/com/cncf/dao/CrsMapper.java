package com.cncf.dao;

import com.cncf.entity.Crs;
import com.cncf.entity.CrsExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CrsMapper {
    List<Crs> selectByBtcIdPage(Integer btcid, int page, int pageSize);

    int countByExample(CrsExample example);

    int deleteByExample(CrsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Crs record);

    int insertSelective(Crs record);

    List<Crs> selectByExample(CrsExample example);

    Crs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Crs record, @Param("example") CrsExample example);

    int updateByExample(@Param("record") Crs record, @Param("example") CrsExample example);

    int updateByPrimaryKeySelective(Crs record);

    int updateByPrimaryKey(Crs record);
}