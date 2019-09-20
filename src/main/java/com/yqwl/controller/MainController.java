package com.yqwl.controller;

import com.yqwl.common.utils.Constants;
import com.yqwl.common.web.BaseController;
import com.yqwl.service.HomePageService;
import com.yqwl.vo.HomePage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("main")
public class MainController extends BaseController {

    @Autowired
    private HomePageService homePageService;



    @ResponseBody
    @RequestMapping(value = "/homePage", method = RequestMethod.POST, produces = Constants.HTML_PRODUCE_TYPE)
    public String homePage() {
        try {
            HomePage result = homePageService.homePage();
            return dealQueryResult(result, result);
        } catch (Exception e) {
            return dealException(-200, "系统异常", e);
        }
    }

}
