package com.yqwl.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sun.org.apache.bcel.internal.generic.RETURN;
import com.yqwl.common.utils.Pager;
import com.yqwl.common.web.BizException;
import com.yqwl.dao.InvestmentMapper;
import com.yqwl.pojo.Investment;
import com.yqwl.service.InvestmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("investmentService")
@Transactional(rollbackFor = { Exception.class })
public class InvestmentServiceImpl implements InvestmentService {
    @Autowired
    private InvestmentMapper investmentMapper;

    @Override
    public Integer insertSelective(Investment record) throws BizException{

        return investmentMapper.insertSelective(record);
    }

    @Override
    public PageInfo<Investment> pageOfInvestment(Pager pager) throws BizException {
        PageHelper.startPage(pager);
        List<Investment> investmentList = investmentMapper.investmentList();
        return new PageInfo<>(investmentList);
    }

    @Override
    public Integer deleteByPrimaryKey(Long id) throws BizException{
        return investmentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public  Integer updateByPrimaryKey(Investment record) throws  BizException{
        return investmentMapper.updateByPrimaryKey(record);
    }
}
