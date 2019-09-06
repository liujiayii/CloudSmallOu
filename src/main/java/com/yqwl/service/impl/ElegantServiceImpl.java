package com.yqwl.service.impl;

import com.yqwl.dao.ElegantMapper;
import com.yqwl.pojo.Elegant;
import com.yqwl.service.ElegantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("elegantService")
@Transactional(rollbackFor = { Exception.class })
public class ElegantServiceImpl implements ElegantService {

    @Autowired
    private ElegantMapper elegantMapper;
    @Override
    public List<Elegant> queryElegantList(Integer type) {

        return elegantMapper.queryElegantList(type);
    }

    @Override
    public Integer insertSelective(Elegant record) {
        return elegantMapper.insertSelective(record);
    }

    @Override
    public Integer deleteByPrimaryKey(Long id){
        return elegantMapper.deleteByPrimaryKey(id);
    }

    @Override
    public  Integer updateByPrimaryKey(Elegant record){
        return elegantMapper.updateByPrimaryKey(record);
    }
}
