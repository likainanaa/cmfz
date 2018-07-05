package com.likainan.cmfz.service.impl;

import com.likainan.cmfz.dao.MenuDao;
import com.likainan.cmfz.entity.Menu;
import com.likainan.cmfz.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by ASUS on 2018/7/5.
 */
@Service
@Transactional
public class MenuServiceImpl implements MenuService {
    @Autowired
    private MenuDao menuDao;
    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public List<Menu> queryAllMenu() {
       List<Menu> list= menuDao.findAllMenu();
       if(list!=null){
           return  list;
       }
        return null;
    }
}
