package com.cncf.service;

import com.cncf.entity.PowerCode;

import java.util.List;

public interface PowerCodeService {

    PowerCode savePowerCode(PowerCode powerCode);

    boolean updatePowerCode(PowerCode powerCode);

    boolean deletePowerCode(int id);

    PowerCode getPowerCodeById(int id);

    List<PowerCode> getPowerCodeListByPage(int page, int pageSize);
    
    Integer getPowerCodeCount();

}
