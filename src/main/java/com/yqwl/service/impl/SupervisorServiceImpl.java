package com.yqwl.service.impl;/**
 * Created by Administrator on 2019/9/4.
 */

import com.yqwl.common.utils.FastJsonUtil;
import com.yqwl.common.utils.MD5Util;
import com.yqwl.common.utils.StringUtils;
import com.yqwl.common.web.BizException;
import com.yqwl.dao.SupervisorMapper;
import com.yqwl.pojo.Supervisor;
import com.yqwl.service.SupervisorService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author LiuHangjing
 * @date 2019/9/4 16:40
 */
@Service("SupervisorService")
public class SupervisorServiceImpl implements SupervisorService{
    private final Logger logger = LoggerFactory.getLogger(getClass());

    private final SupervisorMapper supervisorMapper;
    @Autowired
    public SupervisorServiceImpl(SupervisorMapper supervisorMapper) {
        this.supervisorMapper = supervisorMapper;
    }

    @Override
    public Supervisor login(String username, String password) throws BizException {
        // 验证账号密码
        if(StringUtils.isEmpty(username)){
            logger.error("用户名为空");
            throw new BizException(FastJsonUtil.getResponseJsonNotEmpty(2004, "用户名为空", null));
        }
        if (StringUtils.isEmpty(password)) {
            logger.error("密码为空");
            throw new BizException(FastJsonUtil.getResponseJsonNotEmpty(2001, "密码为空", null));
        }
        String passwords = MD5Util.getMD5Code(password);
        Supervisor supervisor = supervisorMapper.findByUsernamePwd(username,passwords);
        if (supervisor == null) {
            throw new BizException(FastJsonUtil.getResponseJsonNotEmpty(1000, "用户名或密码错误", null));
        }
        return supervisor;
    }

    @Override
    public Integer updatePassword(Supervisor supervisor) throws BizException {

        String password = MD5Util.getMD5Code(supervisor.getPassword());
        supervisor.setPassword(password);
        supervisor.setTime(new Date());
        return supervisorMapper.updateByPrimaryKeySelective(supervisor);
    }

}
