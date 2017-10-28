package com.cncf.service.impl;

import com.cncf.dao.ModuleDao;
import com.cncf.entity.Module;
import com.cncf.service.ModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zj
 * @date 2017/10/25 15:26
 */
@Service
public class ModuleServiceImpl implements ModuleService {
    @Autowired
    private ModuleDao moduleDao;

    @Override
    public List<Module> selectAllParentModule() {
        return moduleDao.selectAllParentModule();
    }

    @Override
    public List<Module> selectAllChildModuleByParentId(String parentId) {
        return moduleDao.selectAllChildModuleByParentId(parentId);
    }
}
