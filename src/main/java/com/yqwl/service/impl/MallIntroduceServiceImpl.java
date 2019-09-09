package com.yqwl.service.impl;/**
 * Created by Administrator on 2019/9/5.
 */

import com.yqwl.common.web.BizException;
import com.yqwl.dao.MallIntroduceMapper;
import com.yqwl.pojo.MallIntroduce;
import com.yqwl.service.MallIntroduceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author LiuHangjing
 * @date 2019/9/5 10:56
 */
@Service("MallIntroduceService")
public class MallIntroduceServiceImpl implements MallIntroduceService {

    private final MallIntroduceMapper mallIntroduceMapper;
    @Autowired
    public MallIntroduceServiceImpl(MallIntroduceMapper mallIntroduceMapper) {
        this.mallIntroduceMapper = mallIntroduceMapper;
    }


    @Override
    public Integer insertMallIntroduce(MallIntroduce mallIntroduce) throws BizException {
        mallIntroduce.setTime(new Date());
        return mallIntroduceMapper.insertSelective(mallIntroduce);
    }

    @Override
    public Integer updateMallIntroduce(MallIntroduce mallIntroduce) throws BizException {
        mallIntroduce.setTime(new Date());
        return mallIntroduceMapper.updateByPrimaryKeySelective(mallIntroduce);
    }

    @Override
    public List<MallIntroduce> showMallIntroduce() throws BizException {
        return mallIntroduceMapper.showMallIntroduce();
    }

    @Override
    public MallIntroduce showFrontMallIntroduce() throws BizException {
        return mallIntroduceMapper.showFrontMallIntroduce();
    }
}
