package com.yqwl.controller;/**
 * Created by Administrator on 2019/9/4.
 */

import com.yqwl.common.utils.Constants;
import com.yqwl.common.web.BaseController;
import com.yqwl.common.web.BizException;
import com.yqwl.pojo.Supervisor;
import com.yqwl.service.SupervisorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * @author LiuHangjing
 * @date 2019/9/4 13:36
 */
@Controller
@RequestMapping("login")
public class BackLoginController extends BaseController {

    private final SupervisorService supervisorService;

    @Autowired
    public BackLoginController(SupervisorService supervisorService) {
        this.supervisorService = supervisorService;
    }

    /**
     * 后台登录
     * @author liuhangjing
     * @date 2019/9/4 17:09
     */
    @RequestMapping(value = "login",method = RequestMethod.POST,produces = Constants.HTML_PRODUCE_TYPE)
    @ResponseBody
    public String login(HttpSession session, String username, String password){
        try {
            Supervisor supervisor = supervisorService.login(username,password);
            if (supervisor != null){
                session.setAttribute(Constants.Login_User, supervisor);
                return dealSuccessResult("登录成功",supervisor);
            }
            return dealFaidResult("登录失败",null);

        } catch (Exception e) {
            return dealException(-200,"系统异常",e);
        }
    }
    /**
     * 退出登录
     * @author liuhangjing
     * @date 2019/9/4 17:12e
     */
    @RequestMapping(value = "logout",method = RequestMethod.POST,produces = Constants.HTML_PRODUCE_TYPE)
    @ResponseBody
    public String logout(HttpSession session){
        try {
            session.invalidate();
            return dealSuccessResult("退出成功",null);
        }catch (Exception e){
            return dealException(-200,"系统异常",e);
        }
    }
    /**
     * 修改登录密码
     * @author liuhangjing
     * @date 2019/9/4 17:12e
     */
    @RequestMapping(value = "updatePassword",method = RequestMethod.POST,produces = Constants.HTML_PRODUCE_TYPE)
    @ResponseBody
    public String updatePassword(Supervisor supervisor){
        try {
            Integer num = supervisorService.updatePassword(supervisor);
            return dealSuccessResult("修改成功",num);
        } catch (BizException e) {
            return dealException(-200,"系统异常",e);
        }

    }
}
