package com.cncf.dao;

import com.cncf.entity.ReportInfo;
import com.cncf.entity.ReportInfoExample;
import com.cncf.entity.ReportInfoWithBLOBs;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ReportInfoMapper {
    List<ReportInfoWithBLOBs> selectAllReportInfoWithBLOBsByPage(int offset, int limit);

    int countByExample(ReportInfoExample example);

    int deleteByExample(ReportInfoExample example);

    int deleteByPrimaryKey(String rid);

    int insert(ReportInfoWithBLOBs record);

    int insertSelective(ReportInfoWithBLOBs record);

    List<ReportInfoWithBLOBs> selectByExampleWithBLOBs(ReportInfoExample example);

    List<ReportInfo> selectByExample(ReportInfoExample example);

    ReportInfoWithBLOBs selectByPrimaryKey(String rid);

    int updateByExampleSelective(@Param("record") ReportInfoWithBLOBs record, @Param("example") ReportInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") ReportInfoWithBLOBs record, @Param("example") ReportInfoExample example);

    int updateByExample(@Param("record") ReportInfo record, @Param("example") ReportInfoExample example);

    int updateByPrimaryKeySelective(ReportInfoWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ReportInfoWithBLOBs record);

    int updateByPrimaryKey(ReportInfo record);
}