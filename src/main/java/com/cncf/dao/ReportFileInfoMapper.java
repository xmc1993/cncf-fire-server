package com.cncf.dao;

import com.cncf.entity.ReportFileInfo;
import com.cncf.entity.ReportFileInfoExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ReportFileInfoMapper {
    List<ReportFileInfo> selectAllReportFileInfoByPage(int offset,int limit);

    int countByExample(ReportFileInfoExample example);

    int deleteByExample(ReportFileInfoExample example);

    int deleteByPrimaryKey(String rid);

    int insert(ReportFileInfo record);

    int insertSelective(ReportFileInfo record);

    List<ReportFileInfo> selectByExampleWithBLOBs(ReportFileInfoExample example);

    List<ReportFileInfo> selectByExample(ReportFileInfoExample example);

    ReportFileInfo selectByPrimaryKey(String rid);

    int updateByExampleSelective(@Param("record") ReportFileInfo record, @Param("example") ReportFileInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") ReportFileInfo record, @Param("example") ReportFileInfoExample example);

    int updateByExample(@Param("record") ReportFileInfo record, @Param("example") ReportFileInfoExample example);

    int updateByPrimaryKeySelective(ReportFileInfo record);

    int updateByPrimaryKeyWithBLOBs(ReportFileInfo record);

    int updateByPrimaryKey(ReportFileInfo record);
}