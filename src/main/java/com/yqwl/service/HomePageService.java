package com.yqwl.service;

import com.yqwl.common.web.BizException;
import com.yqwl.vo.HomePage;

public interface HomePageService {
    HomePage homePage() throws BizException;
}
