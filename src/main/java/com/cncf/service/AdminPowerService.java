package com.cncf.service;

import com.cncf.entity.AdminPower;
import java.util.List;

public interface AdminPowerService {

    AdminPower saveAdminPower(AdminPower adminPower);

    boolean deleteAdminPower(int id);

    boolean deleteAdminPowerWithPrimaryKey(int adminId, int code);

    AdminPower getAdminPowerById(int id);

    List<AdminPower> getAdminPowerListByAdminId(int id);

    List<Integer> getAdminPowerCodeListByAdminId(int id);
    
    List<AdminPower> getAdminPowerListByAdminId(int id, int page, int pageSize);

}
