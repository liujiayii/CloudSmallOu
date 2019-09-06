package com.yqwl.service;

import com.yqwl.common.web.BizException;
import com.yqwl.pojo.Elegant;

import java.util.List;

public interface ElegantService {

    /**查询某种类型风采*/
    List<Elegant> queryElegantList(Integer type) throws BizException;

    /**添加一条风采*/
    Integer insertSelective(Elegant record) throws BizException;

    /**删除一条风采*/
    Integer deleteByPrimaryKey(Long id) throws BizException;

    /**修改一条风采*/
    Integer updateByPrimaryKey(Elegant record) throws  BizException;


}
