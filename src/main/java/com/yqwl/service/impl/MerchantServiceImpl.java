package com.yqwl.service.impl;/**
 * Created by Administrator on 2019/9/5.
 */

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yqwl.common.utils.Pager;
import com.yqwl.common.web.BizException;
import com.yqwl.dao.MerchantMapper;
import com.yqwl.pojo.Merchant;
import com.yqwl.service.MerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author LiuHangjing
 * @date 2019/9/5 15:04
 */
@Service("MerchantService")
public class MerchantServiceImpl implements MerchantService {

    private final MerchantMapper merchantMapper;
    @Autowired
    public MerchantServiceImpl(MerchantMapper merchantMapper) {
        this.merchantMapper = merchantMapper;
    }

    @Override
    public PageInfo<Merchant> showMerchant(Pager pager) throws BizException {
        PageHelper.startPage(pager);
        List<Merchant> merchants = merchantMapper.showMerchant();
        return new PageInfo<>(merchants);
    }

    @Override
    public Integer insertMerchant(Merchant merchant,Long orderTime) throws BizException {
        merchant.setTime(new Date());
        merchant.setOrder_time(new Date(orderTime));
        return merchantMapper.insertSelective(merchant);
    }

    @Override
    public Integer updateMerchant(Merchant merchant, Long orderTime) throws BizException {
        merchant.setTime(new Date());
        merchant.setOrder_time(new Date(orderTime));
        return merchantMapper.updateByPrimaryKeySelective(merchant);
    }

    @Override
    public Integer deleteMerchant(Long merId) throws BizException {
        return merchantMapper.deleteByPrimaryKey(merId);
    }

    @Override
    public Integer updateMerStatus(Long merId) throws BizException {
        return merchantMapper.updateMerStatus(merId);
    }

    @Override
    public Integer updateFirstShow(Long merId) throws BizException {
        return merchantMapper.updateFirstShow(merId);
    }
}
