package com.yqwl.controller;


import com.github.pagehelper.PageInfo;
import com.yqwl.common.utils.Constants;
import com.yqwl.common.utils.Pager;
import com.yqwl.common.web.BaseController;
import com.yqwl.pojo.Brand;
import com.yqwl.service.BrandService;
import com.yqwl.vo.BrandVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;


@Controller
@RequestMapping("brand")
public class BrandController extends BaseController {
    @Autowired
    private BrandService brandService;

    @ResponseBody
    @RequestMapping(value = "/frontListAll", method = RequestMethod.POST, produces = Constants.HTML_PRODUCE_TYPE)
    public String frontListAll(HttpSession session) {
        try {
            List<Brand> result = brandService.frontListAll();
            return dealQueryResult(result, result);
        } catch (Exception e) {
            return dealException(-200, "系统异常", e);
        }
    }

    @ResponseBody
    @RequestMapping(value = "/findAll", method = RequestMethod.POST, produces = Constants.HTML_PRODUCE_TYPE)
    public String listAll(HttpSession session) {
        try {
            List<Brand> result = brandService.findAll();
            return dealQueryResult(result, result);
        } catch (Exception e) {
            return dealException(-200, "系统异常", e);
        }
    }

    @ResponseBody
    @RequestMapping(value = "/getById", method = RequestMethod.POST, produces = Constants.HTML_PRODUCE_TYPE)
    public String getById(HttpSession session,Long id) {
        try {
            BrandVo result = brandService.getById(id);
            return dealQueryResult(result, result);
        } catch (Exception e) {
            return dealException(-200, "系统异常", e);
        }
    }

    @ResponseBody
    @RequestMapping(value = "/pageListAll", method = RequestMethod.POST, produces = Constants.HTML_PRODUCE_TYPE)
    public String pageListAll(HttpSession session, Pager pager) {
        try {
            PageInfo<BrandVo> result = brandService.pageListAll(pager);
            return dealQueryResult(result.getList(), result);
        } catch (Exception e) {
            return dealException(-200, "系统异常", e);
        }
    }

    @ResponseBody
    @RequestMapping(value = "/insert", method = RequestMethod.POST, produces = Constants.HTML_PRODUCE_TYPE)
    public String insert(HttpSession session,Brand brand) {
        try {
            Integer result = brandService.insert(brand);
            return dealSuccessResult("新增成功", result);
        } catch (Exception e) {
            return dealException(-200, "系统异常", e);
        }
    }

    @ResponseBody
    @RequestMapping(value = "/update", method = RequestMethod.POST, produces = Constants.HTML_PRODUCE_TYPE)
    public String update(HttpSession session,Brand brand) {
        try {
            Integer result = brandService.update(brand);
            return dealSuccessResult("修改成功", result);
        } catch (Exception e) {
            return dealException(-200, "系统异常", e);
        }
    }

    @ResponseBody
    @RequestMapping(value = "/delete", method = RequestMethod.POST, produces = Constants.HTML_PRODUCE_TYPE)
    public String delete(HttpSession session, Long id) {
        try {
            Integer result = brandService.delete(id);
            return dealSuccessResult("删除成功", result);
        } catch (Exception e) {
            return dealException(-200, "系统异常", e);
        }
    }

}
