package com.yqwl.controller;/**
 * Created by Administrator on 2019/9/5.
 */

import com.yqwl.common.utils.Constants;
import com.yqwl.common.web.BaseController;
import com.yqwl.common.web.BizException;
import com.yqwl.pojo.MallIntroduce;
import com.yqwl.service.MallIntroduceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 商城介绍控制层
 * @author LiuHangjing
 * @date 2019/9/5 10:55
 */
@Controller
@RequestMapping("mall")
public class MallIntroduceController extends BaseController {

    private final MallIntroduceService mallIntroduceService;
    @Autowired
    public MallIntroduceController(MallIntroduceService mallIntroduceService) {
        this.mallIntroduceService = mallIntroduceService;
    }
    /**
     * 查询显示商城介绍
     * @return
     * @exception
     * @author liuhangjing
     * @date 2019/9/5 17:04e
     */
    @RequestMapping(value = "showMallIntroduce",method = RequestMethod.POST,produces = Constants.HTML_PRODUCE_TYPE)
    @ResponseBody
    public String showMallIntroduce(){
        try {
            List<MallIntroduce> mallIntroduces =  mallIntroduceService.showMallIntroduce();
            return dealQueryResult(mallIntroduces,mallIntroduces);
        } catch (BizException e) {
            return dealException(-200,"系统异常",e);
        }

    }
    /**
     * 添加商城介绍
     * @return
     * @exception
     * @author liuhangjing
     * @date 2019/9/5 11:01e
     */
    @RequestMapping(value = "insertMallIntroduce",method = RequestMethod.POST,produces = Constants.HTML_PRODUCE_TYPE)
    @ResponseBody
    public String insertMallIntroduce(MallIntroduce mallIntroduce){
        try {
            Integer num = mallIntroduceService.insertMallIntroduce(mallIntroduce);

            return dealSuccessResult("添加成功",num);
        } catch (BizException e) {

            return dealException(-200,"系统异常",e);
        }

    }
    /**
     * 修改商城介绍
     * @return
     * @exception
     * @author liuhangjing
     * @date 2019/9/5 11:13e
     */
    @RequestMapping(value = "updateMallIntroduce",method = RequestMethod.POST,produces = Constants.HTML_PRODUCE_TYPE)
    @ResponseBody
    public String updateMallIntroduce(MallIntroduce mallIntroduce){
        try {
            Integer num = mallIntroduceService.updateMallIntroduce(mallIntroduce);

            return dealSuccessResult("修改成功",num);
        } catch (BizException e) {

            return dealException(-200,"系统异常",e);
        }

    }
}
