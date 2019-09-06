package com.yqwl.controller;

import com.github.pagehelper.PageInfo;
import com.yqwl.common.utils.Constants;
import com.yqwl.common.utils.Pager;
import com.yqwl.common.web.BaseController;
import com.yqwl.pojo.Employment;
import com.yqwl.service.EmploymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("employment")
public class EmploymentController extends BaseController {

    @Autowired
    private EmploymentService employmentService;

    @RequestMapping(value = "employmentList", method = RequestMethod.POST, produces = Constants.HTML_PRODUCE_TYPE)
    @ResponseBody
    public String employmentList(Pager pager){
        try {
            PageInfo<Employment> result = employmentService.pageOfEmployment(pager);
            return dealQueryResult(result.getList(), result);
        }catch (Exception e){
            return dealException(-200, "系统异常", e);
        }
    }

    @RequestMapping(value = "selectByKey", method = RequestMethod.POST, produces = Constants.HTML_PRODUCE_TYPE)
    @ResponseBody
    public String selectByKey(Long id){
        try {
            Employment result = employmentService.selectByPrimaryKey(id);
            return dealQueryResult(result,result);
        }catch (Exception e){
            return dealException(-200, "系统异常", e);
        }
    }
    @RequestMapping(value="save", method = RequestMethod.POST, produces = Constants.HTML_PRODUCE_TYPE)
    @ResponseBody
    public String saveEmployment(Employment employment){
        try {
            Integer result = employmentService.insertSelective(employment);
            return dealSuccessResult("新增成功", result);
        }catch (Exception e){
            return dealException(-200, "系统异常", e);
        }

    }

    @RequestMapping(value = "deleteEmployment", method = RequestMethod.POST, produces = Constants.HTML_PRODUCE_TYPE)
    @ResponseBody
    public String deleteEmployment(Long id){
        try{
            Integer result = employmentService.deleteByPrimaryKey(id);
            return dealSuccessResult("删除成功", result);
        }catch (Exception e){
            return dealException(-200, "系统异常", e);
        }
    }

    @RequestMapping(value= "updateEmployment", method = RequestMethod.POST, produces = Constants.HTML_PRODUCE_TYPE)
    @ResponseBody
    public String updateEmployment(Employment employment){
        try{
            Integer result = employmentService.updateByPrimaryKey(employment);
            return dealSuccessResult("修改成功", result);
        }catch (Exception e){
            return dealException(-200, "系统异常", e);
        }
    }

}
