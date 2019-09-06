package com.yqwl.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yqwl.common.utils.BeanUtil;
import com.yqwl.common.utils.Pager;
import com.yqwl.common.web.BizException;
import com.yqwl.dao.BrandMapper;
import com.yqwl.dao.ProductMapper;
import com.yqwl.pojo.Brand;
import com.yqwl.service.BrandService;

import com.yqwl.vo.BrandVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("brandService")
@Transactional(rollbackFor = { Exception.class })
public class BrandServiceImpl implements BrandService {
    @Autowired
    private BrandMapper brandMapper;
    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<Brand> findAll() throws BizException {
        return brandMapper.findAll();
    }

    @Override
    public BrandVo getById(Long id) throws BizException {
        Brand brand = brandMapper.selectByPrimaryKey(id);
        BrandVo brandVo = new BrandVo();
        BeanUtil.copyProperties(brandVo,brand);
        brandVo.setProducts(productMapper.listByBrandId(id));
        return brandVo;
    }

    @Override
    public PageInfo<BrandVo> pageListAll(Pager pager) throws BizException {
        PageHelper.startPage(pager);
        List<BrandVo> list = brandMapper.listAll();
        for (BrandVo brandVo : list) {
            brandVo.setProducts(productMapper.listByBrandId(brandVo.getId()));
        }
        return new PageInfo<>(list);
    }

    @Override
    public Integer insert(Brand brand) throws BizException {
        return brandMapper.insertSelective(brand);
    }

    @Override
    public Integer update(Brand brand) throws BizException {
        return brandMapper.updateByPrimaryKeySelective(brand);
    }

    @Override
    public List<Brand> frontListAll() throws BizException {
        return brandMapper.frontListAll();
    }

    @Override
    public Integer delete(Long id) throws BizException {
        return brandMapper.deleteByPrimaryKey(id);
    }


}
