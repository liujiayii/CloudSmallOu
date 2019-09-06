package com.yqwl.service.impl;

import com.yqwl.common.web.BizException;
import com.yqwl.dao.SystemSettingMapper;
import com.yqwl.service.SystemSettingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("systemSettingService")
@Transactional(rollbackFor = { Exception.class })
public class SystemSettingServiceImpl implements SystemSettingService {

    @Autowired
    private SystemSettingMapper systemSettingMapper;

    @Override
    public Map<String,Object> selectByKeys(List<String> keyList) throws BizException {

        Map<String,Object> map = new HashMap<String,Object>();

        for(String key: keyList){
           map.put(key,systemSettingMapper.selectByKey(key));

        }
        return map;
    }
}
