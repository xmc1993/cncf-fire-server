package com.cncf.dao;

import com.cncf.entity.Btc;
import com.cncf.entity.BtcExample;
import com.cncf.entity.BtcWithBLOBs;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BtcMapper {
    int countByExample(BtcExample example);

    int deleteByExample(BtcExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BtcWithBLOBs record);

    int insertSelective(BtcWithBLOBs record);

    List<BtcWithBLOBs> selectByExampleWithBLOBs(BtcExample example);

    List<Btc> selectByExample(BtcExample example);

    BtcWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BtcWithBLOBs record, @Param("example") BtcExample example);

    int updateByExampleWithBLOBs(@Param("record") BtcWithBLOBs record, @Param("example") BtcExample example);

    int updateByExample(@Param("record") Btc record, @Param("example") BtcExample example);

    int updateByPrimaryKeySelective(BtcWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(BtcWithBLOBs record);

    int updateByPrimaryKey(Btc record);
}