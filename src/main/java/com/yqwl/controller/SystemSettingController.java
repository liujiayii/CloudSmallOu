package com.yqwl.controller;

import com.yqwl.common.utils.Constants;
import com.yqwl.common.web.BaseController;
import com.yqwl.service.SystemSettingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("systemSetting")
public class SystemSettingController extends BaseController {

    @Autowired
    private SystemSettingService systemSettingService;

    @RequestMapping(value = "getValue", method = RequestMethod.POST,produces = Constants.HTML_PRODUCE_TYPE)
    @ResponseBody
    public String getValue(List<String> keyList){
        try{
            Map<String, Object> result = systemSettingService.selectByKeys(keyList);
            return dealQueryResult(result, result);

        }catch (Exception e){
            return dealException(-200, "系统异常", e);
        }
    }

}
