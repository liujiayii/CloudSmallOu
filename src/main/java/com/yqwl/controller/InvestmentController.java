package com.yqwl.controller;


import com.github.pagehelper.PageInfo;
import com.yqwl.common.utils.Constants;
import com.yqwl.common.utils.Pager;
import com.yqwl.common.web.BaseController;
import com.yqwl.pojo.Investment;
import com.yqwl.service.InvestmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("investment")
public class InvestmentController extends BaseController {

    @Autowired
    private InvestmentService investmentService;

    @RequestMapping(value ="save", method = RequestMethod.POST, produces = Constants.HTML_PRODUCE_TYPE )
    @ResponseBody
    public String insertInvestment(Investment investment){
        try{
            Integer result = investmentService.insertSelective(investment);
            return dealSuccessResult("新增成功", result);
        }catch (Exception e){
            return dealException(-200, "系统异常", e);
        }
    }
    @RequestMapping(value="investmentList",method = RequestMethod.POST, produces = Constants.HTML_PRODUCE_TYPE)
    @ResponseBody
    public String investmentList(Pager pager){
        try {
            PageInfo<Investment> result =  investmentService.pageOfInvestment(pager);
            return dealQueryResult(result.getList(), result);
        }catch (Exception e){
            return dealException(-200, "系统异常", e);
        }
    }

    @RequestMapping(value = "deleteInvestment",method = RequestMethod.POST, produces = Constants.HTML_PRODUCE_TYPE)
    @ResponseBody
    public String deleteInvestment(Long id){
        try{
            Integer result = investmentService.deleteByPrimaryKey(id);
            return dealSuccessResult("删除成功", result);
        }catch (Exception e){
            return dealException(-200, "系统异常", e);
        }
    }
    @RequestMapping(value = "updateInvestment", method = RequestMethod.POST, produces = Constants.HTML_PRODUCE_TYPE )
    @ResponseBody
    public String updateInvestment(Investment investment){
        try{
            Integer result = investmentService.updateByPrimaryKey(investment);
            return dealSuccessResult("修改成功", result);
        }catch (Exception e){
            return dealException(-200, "系统异常", e);
        }
    }


}
