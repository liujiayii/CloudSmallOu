package com.yqwl.service;/**
 * Created by Administrator on 2019/9/5.
 */

import com.yqwl.common.web.BizException;
import com.yqwl.pojo.MallIntroduce;

import java.util.List;

/**
 * @author LiuHangjing
 * @date 2019/9/5 10:56
 */
public interface MallIntroduceService {

    Integer insertMallIntroduce(MallIntroduce mallIntroduce) throws BizException;

    Integer updateMallIntroduce(MallIntroduce mallIntroduce) throws BizException;

    List<MallIntroduce> showMallIntroduce() throws BizException;
}
