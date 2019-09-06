package com.yqwl.controller;/**
 * Created by Administrator on 2019/9/5.
 */

import com.github.pagehelper.PageInfo;
import com.yqwl.common.utils.Constants;
import com.yqwl.common.utils.Pager;
import com.yqwl.common.web.BaseController;
import com.yqwl.common.web.BizException;
import com.yqwl.pojo.Merchant;
import com.yqwl.service.MerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 商户介绍控制层
 * @author LiuHangjing
 * @date 2019/9/5 15:04
 */
@Controller
@RequestMapping("merchant")
public class MerchantController extends BaseController {

    private final MerchantService merchantService;

    @Autowired
    public MerchantController(MerchantService merchantService) {
        this.merchantService = merchantService;
    }
    /**
     * 分页查询商户介绍
     * @return
     * @exception 
     * @author liuhangjing
     * @date 2019/9/5 15:14e
     */
    @RequestMapping(value = "showMerchant",method = RequestMethod.POST,produces = Constants.HTML_PRODUCE_TYPE)
    @ResponseBody
    public String showMerchant(Pager pager){
        try {
            PageInfo<Merchant> merchant = merchantService.showMerchant(pager);
            return dealQueryResult(merchant.getList(), merchant);
        } catch (BizException e) {
            return dealException(-200, "系统异常", e);
        }
    }
    /**
     * 添加商户简介
     * @return
     * @exception
     * @author liuhangjing
     * @date 2019/9/5 15:19e
     */
    @RequestMapping(value="insertMerchant",method = RequestMethod.POST,produces = Constants.HTML_PRODUCE_TYPE)
    @ResponseBody
    public String insertMerchant(Merchant merchant,Long orderTime){
        try {
            Integer num = merchantService.insertMerchant(merchant,orderTime);
            return dealSuccessResult("添加成功",num);
        } catch (BizException e) {
            return dealException(-200,"系统异常",e);
        }
    }
    /**
     * 修改商户简介
     * @return
     * @exception
     * @author liuhangjing
     * @date 2019/9/5 15:19e
     */
    @RequestMapping(value="updateMerchant",method = RequestMethod.POST,produces = Constants.HTML_PRODUCE_TYPE)
    @ResponseBody
    public String updateMerchant(Merchant merchant,Long orderTime){
        try {
            Integer num = merchantService.updateMerchant(merchant,orderTime);
            return dealSuccessResult("修改成功",num);
        } catch (BizException e) {
            return dealException(-200,"系统异常",e);
        }
    }
    /**
     * 删除商户简介
     * @return
     * @exception
     * @author liuhangjing
     * @date 2019/9/5 15:24e
     */
    @RequestMapping(value = "deleteMerchant",method = RequestMethod.POST,produces = Constants.HTML_PRODUCE_TYPE)
    @ResponseBody
    public String deleteMerchant(Long merId){
        try {
            Integer num  = merchantService.deleteMerchant(merId);
            return dealSuccessResult("删除成功",num);
        } catch (BizException e) {
            return dealException(-200,"系统异常",e);
        }

    }
    /**
     * 修改商户上下架状态
     * @return
     * @exception
     * @author liuhangjing
     * @date 2019/9/5 15:28e
     */
    @RequestMapping(value = "updateMerStatus",method = RequestMethod.POST,produces = Constants.HTML_PRODUCE_TYPE)
    @ResponseBody
    public String updateMerStatus(Long merId){
        try {
            Integer num = merchantService.updateMerStatus(merId);
            return dealSuccessResult("修改成功",num);
        } catch (BizException e) {
            return dealException(-200,"系统异常",e);
        }
    }
    /**
     * 修改商户是否在前台显示
     * @return
     * @exception
     * @author liuhangjing
     * @date 2019/9/5 15:37e
     */
    @RequestMapping(value = "updateFirstShow",method = RequestMethod.POST,produces = Constants.HTML_PRODUCE_TYPE)
    @ResponseBody
    public String updateFirstShow(Long merId){
        try {
            Integer num = merchantService.updateFirstShow(merId);
            return dealSuccessResult("修改成功",num);
        } catch (BizException e) {
            return dealException(-200,"系统异常",e);
        }
    }
}
