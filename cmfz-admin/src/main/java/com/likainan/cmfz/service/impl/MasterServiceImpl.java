package com.likainan.cmfz.service.impl;

import com.likainan.cmfz.dao.MasterDao;
import com.likainan.cmfz.entity.Master;
import com.likainan.cmfz.service.MasterService;
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
    public Map<String, Object> queryAllMaster(int page, int rows) {
        List<Master> list=masterDao.findAllMaster(page,rows);
        int count =masterDao.count();
        Map<String,Object> map=new HashMap<String,Object>();
        if(list!=null){
            map.put("tatal",count);
            map.put("rows",list);
            return map;
        }
        return null;
    }
}
