package com.cncf.service;

import com.cncf.entity.Admin;

import java.util.List;

public interface AdminService {
    Admin getAdminByName(String adminName);

    Admin getAdminByAccessToken(String accessToken);

    boolean updateAccessToken(Admin admin);

    boolean saveAdmin(Admin admin);

    boolean deleteAdmin(int adminId);
}
