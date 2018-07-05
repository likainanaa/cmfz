package com.likainan.cmfz.service.impl;

import com.likainan.cmfz.dao.ManagerDao;
import com.likainan.cmfz.entity.Manager;
import com.likainan.cmfz.service.ManagerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by ASUS on 2018/7/4.
 */
@Service
@Transactional
public class ManagerServiceImpl implements ManagerService{
    @Autowired
    private ManagerDao managerDao;
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    @Override
    public Manager queryManager(Manager mgr) {
        System.out.println(mgr.getMgrName());
        Manager manager=managerDao.findManager(mgr.getMgrName());
        System.out.println(manager);
        String password = manager.getMgrPassword();
        String src = mgr.getMgrPassword();
//        boolean flag = MD5Utils.chexkPasseord(src,password);
        if(src.equals(password)) {
            return mgr;
        }
        return null;
    }
}
