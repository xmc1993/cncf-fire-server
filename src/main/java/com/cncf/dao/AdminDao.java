package com.cncf.dao;

import com.cncf.entity.Admin;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface AdminDao {
    Admin getAdminByName(String adminName);

    boolean saveAdmin(Admin admin);

    boolean deleteAdmin(int id);

    boolean updateAccessToken(Admin admin);
}
