package com.yqwl.service;

import com.github.pagehelper.PageInfo;
import com.yqwl.common.utils.Pager;
import com.yqwl.common.web.BizException;
import com.yqwl.pojo.Investment;

public interface InvestmentService {

    /**前台加盟商电话信息*/
    Integer insertSelective(Investment record) throws BizException;

    /**查看加盟商列表*/
    PageInfo<Investment> pageOfInvestment(Pager pager) throws BizException;

    /**删除一条招商加盟*/
    Integer deleteByPrimaryKey(Long id) throws BizException;

    /**修改一条招商加盟*/
    Integer updateByPrimaryKey(Investment record) throws  BizException;



}
