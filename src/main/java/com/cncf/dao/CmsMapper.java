package com.cncf.dao;

import com.cncf.entity.Cms;
import com.cncf.entity.CmsExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CmsMapper {
    List<Cms> selectByBtcIdPage(Integer btcid, int page, int pageSize);

    int countByExample(CmsExample example);

    int deleteByExample(CmsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Cms record);

    int insertSelective(Cms record);

    List<Cms> selectByExample(CmsExample example);

    Cms selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Cms record, @Param("example") CmsExample example);

    int updateByExample(@Param("record") Cms record, @Param("example") CmsExample example);

    int updateByPrimaryKeySelective(Cms record);

    int updateByPrimaryKey(Cms record);
}