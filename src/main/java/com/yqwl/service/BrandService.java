package com.yqwl.service;

import com.github.pagehelper.PageInfo;
import com.yqwl.common.utils.Pager;
import com.yqwl.common.web.BizException;
import com.yqwl.pojo.Brand;
import com.yqwl.vo.BrandVo;

import java.util.List;

public interface BrandService {
    List<Brand> findAll() throws BizException;

    BrandVo getById(Long id) throws BizException;

    PageInfo<BrandVo> pageListAll(Pager pager) throws BizException;

    Integer insert(Brand brand) throws BizException;

    Integer update(Brand brand) throws BizException;

    List<Brand> frontListAll() throws BizException;

    Integer delete(Long id) throws BizException;
}
