package com.yqwl.service;

import com.yqwl.common.web.BizException;

import java.util.List;
import java.util.Map;

public interface SystemSettingService {

    public Map<String,Object> selectByKeys(List<String> keyList) throws BizException;

}
