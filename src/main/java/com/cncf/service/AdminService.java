package com.cncf.service;

import com.cncf.entity.Admin;

import java.util.List;

public interface AdminService {
    Admin getAdminByName(String adminName);

    boolean saveAdmin(Admin admin);

    boolean deleteAdmin(int adminId);

    boolean updateAccessToken(Admin admin);
}
