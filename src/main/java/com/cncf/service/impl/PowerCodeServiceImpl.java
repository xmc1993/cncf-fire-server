package com.cncf.service.impl;

import com.cncf.dao.PowerCodeDao;
import com.cncf.entity.PowerCode;
import com.cncf.service.PowerCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PowerCodeServiceImpl implements PowerCodeService {

    @Autowired
    private PowerCodeDao powerCodeDao;


    @Override
    public PowerCode savePowerCode(PowerCode powerCode) {
        if (powerCodeDao.savePowerCode(powerCode)) {
            return powerCode;
        }
        return null;
    }

    @Override
    public boolean updatePowerCode(PowerCode powerCode) {
        return powerCodeDao.updatePowerCode(powerCode);
    }

    @Override
    public boolean deletePowerCode(int id) {
        return powerCodeDao.deletePowerCode(id);
    }

    @Override
    public PowerCode getPowerCodeById(int id) {
        return powerCodeDao.getPowerCodeById(id);
    }

    @Override
    public List<PowerCode> getPowerCodeList() {
        return powerCodeDao.getPowerCodeList();
    }


    @Override
	public Integer getPowerCodeCount() {
		return powerCodeDao.getPowerCodeCount();
	}
}
