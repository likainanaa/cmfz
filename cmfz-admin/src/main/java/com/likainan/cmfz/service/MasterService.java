package com.likainan.cmfz.service;

import com.likainan.cmfz.entity.Master;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * Created by ASUS on 2018/7/6.
 */

public interface MasterService {
    Object queryAllMaster(int page,int rows,String name);
    int addMasters(List<Master>list);
}
