package com.cncf.service;

import com.cncf.entity.Admin;

import java.util.List;

public interface AdminService {
    Admin getAdminByName(String adminName);

    boolean saveAdmin(Admin admin);

    boolean deleteAdmin(Integer adminId);

    boolean updateAccessToken(Admin admin);

    List<Admin> selectAllAdmin();
}
