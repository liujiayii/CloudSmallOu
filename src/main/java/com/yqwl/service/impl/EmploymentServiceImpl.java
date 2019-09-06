package com.yqwl.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yqwl.common.utils.Pager;
import com.yqwl.common.web.BizException;
import com.yqwl.dao.EmploymentMapper;
import com.yqwl.pojo.Employment;
import com.yqwl.service.EmploymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service("employmentService")
@Transactional(rollbackFor = { Exception.class })
public class EmploymentServiceImpl implements EmploymentService {

    @Autowired
    private EmploymentMapper employmentMapper;

    @Override
    public PageInfo<Employment> pageOfEmployment(Pager pager) throws BizException {
        PageHelper.startPage(pager);
        List<Employment> employmentList = employmentMapper.employmentList();
        return new PageInfo<>(employmentList);
    }

    @Override
    public Employment selectByPrimaryKey(Long id) throws BizException {
        return employmentMapper.selectByPrimaryKey(id);
    }

    @Override
    public Integer insertSelective(Employment employment) throws BizException {
        employment.setTime(new Date());
        return employmentMapper.insertSelective(employment);
    }

    @Override
    public Integer deleteByPrimaryKey(Long id) throws BizException{
        return employmentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Integer updateByPrimaryKey(Employment record) throws  BizException{
        return employmentMapper.updateByPrimaryKey(record);
    }
}
