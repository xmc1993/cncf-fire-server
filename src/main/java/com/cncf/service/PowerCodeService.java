package com.cncf.service;

import com.cncf.entity.PowerCode;

import java.util.List;

/**
 * @author zj
 */
public interface PowerCodeService {

    PowerCode savePowerCode(PowerCode powerCode);

    boolean updatePowerCode(PowerCode powerCode);

    boolean deletePowerCode(int id);

    PowerCode getPowerCodeById(int id);

    List<PowerCode> getPowerCodeList();
    
    Integer getPowerCodeCount();

}
