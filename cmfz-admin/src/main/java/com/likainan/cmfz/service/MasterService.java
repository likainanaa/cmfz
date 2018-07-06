package com.likainan.cmfz.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;

/**
 * Created by ASUS on 2018/7/6.
 */

public interface MasterService {
    Map<String,Object> queryAllMaster(int page,int rows);
}
