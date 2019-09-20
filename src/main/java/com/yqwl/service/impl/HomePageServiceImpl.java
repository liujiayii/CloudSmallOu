package com.yqwl.service.impl;

import com.yqwl.common.web.BizException;
import com.yqwl.dao.*;
import com.yqwl.service.HomePageService;
import com.yqwl.vo.HomePage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;

@Service("homePageService")
@Transactional(rollbackFor = {Exception.class})
public class HomePageServiceImpl implements HomePageService {

    @Autowired
    private BrandMapper brandMapper;
    @Autowired
    private IntroduceMapper introduceMapper;
    @Autowired
    private MerchantMapper merchantMapper;
    @Autowired
    private NewsTrendsMapper newsTrendsMapper;
    @Autowired
    private SystemSettingMapper systemSettingMapper;



    @Override
    public HomePage homePage() throws BizException {
        HomePage homePage = new HomePage();
        homePage.setBrands(brandMapper.homePage());
        homePage.setIntroduce(introduceMapper.introduce());
        homePage.setMerchant(merchantMapper.homePage());
        Map<String,Object> map = new HashMap<>();
        map.put("A",newsTrendsMapper.homePage());
        map.put("B",newsTrendsMapper.listByColumnProgramaId(1));
        map.put("C",newsTrendsMapper.listByColumnProgramaId(2));
        homePage.setNewsTrends(map);
        homePage.setSystemSetting(systemSettingMapper.listAll());
        return homePage;
    }
}
