package com.cncf.dao;

import com.cncf.entity.AdminPower;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdminPowerDao {

    boolean saveAdminPower(AdminPower adminPower);

    boolean deleteAdminPower(int id);

    AdminPower getAdminPowerById(int id);

    List<AdminPower> getAdminPowerListAdminId(int id);

    boolean deleteAdminPowerWithPrimaryKey(int adminId, int code);
    
    List<AdminPower> getAdminPowerListByAdminId(int id, int offset, int limit);

}
