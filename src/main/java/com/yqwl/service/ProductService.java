package com.yqwl.service;

import com.github.pagehelper.PageInfo;
import com.yqwl.common.utils.Pager;
import com.yqwl.common.web.BizException;
import com.yqwl.pojo.Product;

public interface ProductService {
    Integer insert(Product product) throws BizException;

    Integer update(Product product) throws BizException;

    PageInfo<Product> pageListAll(Pager pager) throws BizException;

    Integer delete(Long id) throws BizException;
}
