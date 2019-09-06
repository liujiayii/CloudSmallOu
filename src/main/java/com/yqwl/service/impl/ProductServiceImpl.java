package com.yqwl.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yqwl.common.utils.Pager;
import com.yqwl.common.web.BizException;
import com.yqwl.dao.ProductMapper;
import com.yqwl.pojo.Product;
import com.yqwl.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("productService")
@Transactional(rollbackFor = { Exception.class })
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductMapper productMapper;


    @Override
    public Integer insert(Product product) throws BizException {
        return productMapper.insertSelective(product);
    }

    @Override
    public Integer update(Product product) throws BizException {
        return productMapper.updateByPrimaryKeySelective(product);
    }

    @Override
    public PageInfo<Product> pageListAll(Pager pager) throws BizException {
        PageHelper.startPage(pager);
        List<Product> products = productMapper.listAll();
        return new PageInfo<>(products);
    }

    @Override
    public Integer delete(Long id) throws BizException {
        return productMapper.deleteByPrimaryKey(id);
    }

}
