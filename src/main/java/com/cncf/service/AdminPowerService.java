package com.cncf.service;

import com.cncf.entity.AdminPower;
import java.util.List;

public interface AdminPowerService {

    AdminPower saveAdminPower(AdminPower adminPower);

    boolean deleteAdminPowerById(int id);

    boolean deleteAdminPower(int adminId, int code);

    AdminPower getAdminPowerById(int id);

    List<AdminPower> getAdminPowerListAdminId(int id);

    /**
     * @param id
     * @return
     * 该方法在AdminAccessTokenValidationInterceptor用到
     */
    List<Integer> getAdminPowerCodeListByAdminId(int id);

}
