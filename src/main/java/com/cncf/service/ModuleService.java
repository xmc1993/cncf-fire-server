package com.cncf.service;

import com.cncf.entity.Module;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zj
 * @date 2017/10/25 15:04
 */

public interface ModuleService {
    List<Module> selectAllParentModule();
    List<Module> selectAllChildModuleByParentId(String parentId);
}
