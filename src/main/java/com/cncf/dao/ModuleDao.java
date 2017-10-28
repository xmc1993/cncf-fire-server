package com.cncf.dao;

import com.cncf.entity.Module;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author zj
 * @date 2017/10/25 15:04
 */
@Repository
public interface ModuleDao {
    List<Module> selectAllParentModule();
    List<Module> selectAllChildModuleByParentId(String parentId);
}
