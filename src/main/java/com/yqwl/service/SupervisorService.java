package com.yqwl.service;/**
 * Created by Administrator on 2019/9/4.
 */

import com.yqwl.common.web.BizException;
import com.yqwl.pojo.Supervisor;

/**
 * @author LiuHangjing
 * @date 2019/9/4 16:40
 */
public interface SupervisorService {

    Supervisor login(String username, String password) throws BizException;

    Integer updatePassword(Supervisor supervisor) throws BizException;

}
