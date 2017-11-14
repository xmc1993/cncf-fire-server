package com.cncf.dao;

import com.cncf.entity.PowerCode;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PowerCodeDao {

    boolean savePowerCode(PowerCode powerCode);

    boolean updatePowerCode(PowerCode powerCode);

    boolean deletePowerCode(int id);

    PowerCode getPowerCodeById(int id);

    List<PowerCode> getPowerCodeList();

    int getPowerCodeCount();
}
