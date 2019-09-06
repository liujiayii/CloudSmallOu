package com.yqwl.controller;

import com.yqwl.common.utils.Constants;

import com.yqwl.common.web.BaseController;
import com.yqwl.pojo.Introduce;
import com.yqwl.service.IntroduceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;


@Controller
@RequestMapping("introduce")
public class IntroduceController extends BaseController {

    @Resource
    private IntroduceService introduceService;

    @RequestMapping(value="introduce",method = RequestMethod.POST, produces = Constants.HTML_PRODUCE_TYPE)
    @ResponseBody
    public String introduce(){
        try {
            Introduce result = introduceService.introduce();
            return dealQueryResult(result, result);
        }catch (Exception e){
            return dealException(-200, "系统异常", e);
        }
    }
    @RequestMapping(value = "updateIntroduce",method = RequestMethod.POST, produces = Constants.HTML_PRODUCE_TYPE)
    @ResponseBody
    public String updateIntroduce(Introduce introduce){
        try {
            Integer result = introduceService.updateIntroduce(introduce);
            return dealSuccessResult("修改成功", result);
        }catch (Exception e){
            return dealException(-200, "系统异常", e);
        }
    }
    @RequestMapping(value = "deleteIntroduce", method = RequestMethod.POST, produces = Constants.HTML_PRODUCE_TYPE)
    @ResponseBody
    public String deleteIntroduce(Long id){
        try{
            Integer result = introduceService.deleteByPrimaryKey(id);
            return dealSuccessResult("删除成功", result);
        }catch (Exception e){
            return dealException(-200, "系统异常", e);
        }
    }
    @RequestMapping(value = "insertIntroduce",method = RequestMethod.POST,produces = Constants.HTML_PRODUCE_TYPE)
    @ResponseBody
    public String insertIntroduce(Introduce introduce){
        try{
            Integer result = introduceService.insertSelective(introduce);
            return dealSuccessResult("新增成功", result);

        }catch (Exception e){
            return dealException(-200, "系统异常", e);
        }
    }
}
