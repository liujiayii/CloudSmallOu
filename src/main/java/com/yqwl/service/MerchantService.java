package com.yqwl.service;

import com.github.pagehelper.PageInfo;
import com.yqwl.common.utils.Pager;
import com.yqwl.common.web.BizException;
import com.yqwl.pojo.Merchant;

import java.util.List;

/**
 * Created by Administrator on 2019/9/5.
 */
public interface MerchantService {

    PageInfo<Merchant> showMerchant(Pager pager) throws BizException;

    Integer insertMerchant(Merchant merchant,Long orderTime) throws BizException;

    Integer updateMerchant(Merchant merchant, Long orderTime) throws BizException;

    Integer deleteMerchant(Long merId) throws BizException;

    Integer updateMerStatus(Long merId) throws BizException;

    Integer updateFirstShow(Long merId) throws BizException;

    List<Merchant> showFrontMerchant() throws BizException;
}
