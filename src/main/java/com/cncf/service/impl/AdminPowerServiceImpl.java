package com.cncf.service.impl;

import com.cncf.dao.AdminPowerDao;
import com.cncf.entity.AdminPower;
import com.cncf.service.AdminPowerService;
import com.cncf.util.JedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;

import java.util.ArrayList;
import java.util.List;

@Service
public class AdminPowerServiceImpl implements AdminPowerService {

    @Autowired
    private AdminPowerDao adminPowerDao;

    @Override
    public AdminPower saveAdminPower(AdminPower adminPower) {
        clearCache(adminPower.getAdminId());
        if (adminPowerDao.saveAdminPower(adminPower)) {
            return adminPower;
        }
        return null;
    }

    @Override
    public boolean deleteAdminPowerById(int id) {
        AdminPower adminPower = adminPowerDao.getAdminPowerById(id);
        if (adminPower != null) {
            clearCache(adminPower.getAdminId());
        }
        return adminPowerDao.deleteAdminPowerById(id);
    }

    @Override
    public boolean deleteAllPowerByAdminId() {
        return adminPowerDao.deleteAllPowerByAdminId();
    }

    @Override
    public boolean deleteAdminPower(int adminId, int code) {
        clearCache(adminId);
        return adminPowerDao.deleteAdminPower(adminId, code);
    }

    @Override
    public AdminPower getAdminPowerById(int id) {
        return adminPowerDao.getAdminPowerById(id);
    }

    @Override
    public List<AdminPower> getAdminPowerListAdminId(int id) {
        return adminPowerDao.getAdminPowerListAdminId(id);
    }

    @Override
    public List<Integer> getAdminPowerCodeListByAdminId(int id) {
        List<AdminPower> list = getAdminPowerListAdminId(id);
        List<Integer> res = new ArrayList<>();
        for (AdminPower adminPower : list) {
            res.add(adminPower.getCodeId());
        }
        return res;
    }

    /**
     * 清除权限缓存
     * @param id
     */
    private void clearCache(int id) {
        Jedis jedis = JedisUtil.getJedis();
        try {
            jedis.del("PowerCodes-" + id);
        } catch (Exception e) {

        } finally {
            if (jedis != null) {
                jedis.close();
            }
        }

    }

}
