package com.yqwl.service;

import com.yqwl.common.web.BizException;
import com.yqwl.pojo.Introduce;

/**
 * 查看公司介绍
 */
public interface IntroduceService {
    Introduce introduce() throws BizException;

    Integer updateIntroduce(Introduce introduce) throws  BizException;

    Integer deleteByPrimaryKey(Long id) throws  BizException;

    Integer insertSelective(Introduce record) throws  BizException;

}


