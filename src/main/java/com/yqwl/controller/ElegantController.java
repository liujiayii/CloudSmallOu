package com.yqwl.controller;

import com.yqwl.common.utils.Constants;
import com.yqwl.common.web.BaseController;
import com.yqwl.pojo.Elegant;
import com.yqwl.service.ElegantService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("elegant")
public class ElegantController extends BaseController {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private ElegantService elegantService;

    @RequestMapping(value = "queryElegantList", method = RequestMethod.POST, produces = Constants.HTML_PRODUCE_TYPE)
    @ResponseBody
    public String queryElegantList(Integer type){
        try {
            List<Elegant> result = elegantService.queryElegantList(type);
            return dealQueryResult(result, result);
        }catch (Exception e){
            return dealException(-200, "系统异常", e);
        }
    }
    @RequestMapping(value = "insertElegant", method = RequestMethod.POST, produces = Constants.HTML_PRODUCE_TYPE)
    @ResponseBody
    public String insertElegant(Elegant elegant){
        try {
            Integer result = elegantService.insertSelective(elegant);
            return dealSuccessResult("新增成功", result);
        }catch (Exception e){
            return dealException(-200, "系统异常", e);
        }
    }

    @RequestMapping(value ="deleteElegant",  method = RequestMethod.POST, produces = Constants.HTML_PRODUCE_TYPE )
    @ResponseBody
    public String deleteElegant(Long id){
        try{
            Integer result = elegantService.deleteByPrimaryKey(id);
            return dealSuccessResult("删除成功", result);

        }catch (Exception e){
            return dealException(-200, "系统异常", e);
        }
    }

    @RequestMapping(value ="updateElegant",  method = RequestMethod.POST, produces = Constants.HTML_PRODUCE_TYPE )
    @ResponseBody
    public String updateElegant(Elegant elegant){
        try {
            Integer result = elegantService.updateByPrimaryKey(elegant);
            return dealSuccessResult("删除成功", result);

        }catch (Exception e){
            return dealException(-200, "系统异常", e);
        }
    }




}
