package com.cncf.service;

import com.cncf.entity.Cms;

import java.util.List;

/**
 * @author zj
 * @date 2017/10/29 19:51
 */
public interface CmsService {
/*    ResponseData<List<Cms>> selectByBtcIdPage(Integer btcid, int page, int pageSize);*/

    List<Cms> selectByBtcIdPage(Integer btcid, int page, int pageSize);
    Cms selectById(Integer id);
    int insertCms(Cms cms);
    int deleteCms(Integer id);
    int updateCms(Cms cms);
}
