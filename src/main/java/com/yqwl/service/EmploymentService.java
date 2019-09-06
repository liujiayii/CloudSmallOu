package com.yqwl.service;

import com.github.pagehelper.PageInfo;
import com.yqwl.common.utils.Pager;
import com.yqwl.common.web.BizException;
import com.yqwl.pojo.Employment;

public interface EmploymentService {

    PageInfo<Employment> pageOfEmployment(Pager pager) throws BizException;

    Employment selectByPrimaryKey(Long id) throws BizException;

    Integer insertSelective(Employment employment) throws BizException;

    Integer updateByPrimaryKey(Employment record) throws  BizException;

    Integer deleteByPrimaryKey(Long id) throws BizException;



}
