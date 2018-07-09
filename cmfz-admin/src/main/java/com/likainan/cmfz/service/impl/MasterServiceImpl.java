package com.likainan.cmfz.service.impl;

import com.likainan.cmfz.dao.MasterDao;
import com.likainan.cmfz.entity.Master;
import com.likainan.cmfz.service.MasterService;
import com.likainan.cmfz.untils.GetUUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ASUS on 2018/7/6.
 */
@Service
@Transactional
public class MasterServiceImpl implements MasterService{
    @Autowired
    private MasterDao masterDao;
    @Override
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public Object queryAllMaster(int page, int rows,String name) {
        List<Master> list=masterDao.findAllMaster(page,rows,name);
        int count =masterDao.count();
        Map<String,Object> map=new HashMap<String,Object>();
        if(list!=null){
            if(rows<0){
                return list;
            }
            else{
                map.put("total",count);
                map.put("rows",list);
                return map;
            }
        }
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public int addMasters(List<Master> list) {
        for (Master master:list){
            master.setMasterId(GetUUID.getUUID());
        }
       int n= masterDao.insertMasters(list);
       if(n!=0){
                return  n;
           }
       return  0;
    }

}
