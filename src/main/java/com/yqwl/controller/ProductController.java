package com.yqwl.controller;

import com.github.pagehelper.PageInfo;
import com.yqwl.common.utils.Constants;
import com.yqwl.common.utils.Pager;
import com.yqwl.common.web.BaseController;
import com.yqwl.pojo.Product;
import com.yqwl.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("product")
public class ProductController extends BaseController {

    @Autowired
    private ProductService productService;

    @ResponseBody
    @RequestMapping(value = "/insert", method = RequestMethod.POST, produces = Constants.HTML_PRODUCE_TYPE)
    public String insert(HttpSession session, Product product) {
        try {
            Integer result = productService.insert(product);
            return dealSuccessResult("新增成功", result);
        } catch (Exception e) {
            return dealException(-200, "系统异常", e);
        }
    }

    @ResponseBody
    @RequestMapping(value = "/update", method = RequestMethod.POST, produces = Constants.HTML_PRODUCE_TYPE)
    public String update(HttpSession session, Product product) {
        try {
            Integer result = productService.update(product);
            return dealSuccessResult("修改成功", result);
        } catch (Exception e) {
            return dealException(-200, "系统异常", e);
        }
    }

    @ResponseBody
    @RequestMapping(value = "/pageListAll", method = RequestMethod.POST, produces = Constants.HTML_PRODUCE_TYPE)
    public String pageListAll(HttpSession session, Pager pager) {
        try {
            PageInfo<Product> result = productService.pageListAll(pager);
            return dealQueryResult(result.getList(), result);
        } catch (Exception e) {
            return dealException(-200, "系统异常", e);
        }
    }

    @ResponseBody
    @RequestMapping(value = "/delete", method = RequestMethod.POST, produces = Constants.HTML_PRODUCE_TYPE)
    public String delete(HttpSession session, Long id) {
        try {
            Integer result = productService.delete(id);
            return dealSuccessResult("删除成功", result);
        } catch (Exception e) {
            return dealException(-200, "系统异常", e);
        }
    }

//    @ResponseBody
//    @RequestMapping(value = "/listByBrandId", method = RequestMethod.POST, produces = Constants.HTML_PRODUCE_TYPE)
//    public String listByBrandId(HttpSession session, Long id) {
//        try {
//            list result = productService.pageListAll(pager);
//            return dealQueryResult(result.getList(), result);
//        } catch (Exception e) {
//            return dealException(-200, "系统异常", e);
//        }
//    }
}
