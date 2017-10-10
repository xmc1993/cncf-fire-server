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

    @Override
    public Admin getAdminByName(String adminName) {
        return adminDao.getAdminByName(adminName);
    }

    @Override
    public Admin getAdminByAccessToken(String accessToken) {
        return adminDao.getAdminByAccessToken(accessToken);
    }

    @Override
    public boolean updateAccessToken(Admin admin) {
        return adminDao.updateToken(admin);
    }

    @Override
    public boolean saveAdmin(Admin admin) {
        return adminDao.saveAdmin(admin);
    }

    @Override
    public boolean deleteAdmin(int adminId) {
        return adminDao.deleteAdmin(adminId);
    }
}
