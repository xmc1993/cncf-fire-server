package com.cncf.dao;

import com.cncf.entity.Pact;
import com.cncf.entity.PactExample;
import com.cncf.entity.PactWithBLOBs;
import lombok.Data;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PactMapper {
    int countByExample(PactExample example);

    int deleteByExample(PactExample example);

    int deleteByPrimaryKey(String pactId);

    int insert(PactWithBLOBs record);

    int insertSelective(PactWithBLOBs record);

    List<PactWithBLOBs> selectByExampleWithBLOBs(PactExample example);

    List<Pact> selectByExample(PactExample example);

    PactWithBLOBs selectByPrimaryKey(String pactId);

    int updateByExampleSelective(@Param("record") PactWithBLOBs record, @Param("example") PactExample example);

    int updateByExampleWithBLOBs(@Param("record") PactWithBLOBs record, @Param("example") PactExample example);

    int updateByExample(@Param("record") Pact record, @Param("example") PactExample example);

    int updateByPrimaryKeySelective(PactWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(PactWithBLOBs record);

    int updateByPrimaryKey(Pact record);
}