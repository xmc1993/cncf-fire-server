package com.cncf.service.impl;

import com.cncf.dao.AdminDao;
import com.cncf.entity.Admin;
import com.cncf.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminDao adminDao;

    public Admin getAdminByName(String adminName) {
        return adminDao.getAdminByName(adminName);
    }

    public boolean saveAdmin(Admin admin) {
        return adminDao.saveAdmin(admin);
    }

    public boolean deleteAdmin(Integer adminId) {
        return adminDao.deleteAdmin(adminId);
    }

    @Override
    public boolean updateAccessToken(Admin admin) {
        return adminDao.updateAccessToken(admin);
    }
}
