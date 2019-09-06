package com.yqwl.service.impl;

import com.yqwl.common.web.BizException;
import com.yqwl.dao.IntroduceMapper;
import com.yqwl.pojo.Introduce;
import com.yqwl.service.IntroduceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service("introduceService")
@Transactional(rollbackFor = { Exception.class })
public class IntroduceServiceImpl implements IntroduceService {

    @Autowired
    private IntroduceMapper introduceMapper;

    @Override
    public Introduce introduce() throws BizException {
        return introduceMapper.introduce();
    }

    @Override
    public Integer updateIntroduce(Introduce introduce) throws BizException{
        return introduceMapper.updateByPrimaryKeySelective(introduce);
    }

    @Override
    public Integer deleteByPrimaryKey(Long id) throws  BizException{
        return introduceMapper.deleteByPrimaryKey(id);
    };

    @Override
    public Integer insertSelective(Introduce record) throws  BizException{
        return  introduceMapper.insertSelective(record);
    };


}
