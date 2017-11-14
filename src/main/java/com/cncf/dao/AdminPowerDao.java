package com.cncf.dao;

import com.cncf.entity.AdminPower;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdminPowerDao {

    boolean saveAdminPower(AdminPower adminPower);

    boolean deleteAdminPowerById(int id);

    AdminPower getAdminPowerById(int id);

    List<AdminPower> getAdminPowerListAdminId(int id);

    boolean deleteAdminPower(int adminId, int code);
}
