package com.yqwl.service.impl;/**
 * Created by Administrator on 2019/9/4.
 */

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yqwl.common.utils.Pager;
import com.yqwl.common.web.BizException;
import com.yqwl.dao.NewsTrendsMapper;
import com.yqwl.pojo.NewsTrends;
import com.yqwl.service.NewsTrendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author LiuHangjing
 * @date 2019/9/4 13:50
 */
@Service("NewsTrendService")
public class NewsTrendServiceImpl implements NewsTrendService{

    private final NewsTrendsMapper newsTrendsMapper;
    @Autowired
    public NewsTrendServiceImpl(NewsTrendsMapper newsTrendsMapper) {
        this.newsTrendsMapper = newsTrendsMapper;
    }

    @Override
    public Integer insertNewsTrend(NewsTrends newsTrends,Long orderTime) throws BizException{
        newsTrends.setTime(new Date());
        newsTrends.setOrder_time(new Date(orderTime));
        return newsTrendsMapper.insertSelective(newsTrends);
    }

    @Override
    public Integer updateNewsTrend(NewsTrends newsTrends,Long orderTime) throws BizException{
        newsTrends.setOrder_time(new Date(orderTime));
        return newsTrendsMapper.updateByPrimaryKeySelective(newsTrends);
    }

    @Override
    public PageInfo<NewsTrends> showListNewsTrend(Pager pager) throws BizException {
        PageHelper.startPage(pager);
        List<NewsTrends> list = newsTrendsMapper.showListNewsTrend();
        return new PageInfo<>(list);
    }

    @Override
    public Integer deleteNewsTrend(Long newsId) throws BizException {
        return newsTrendsMapper.deleteByPrimaryKey(newsId);
    }

    @Override
    public Integer deleteSelectNewsTrend(Long... newsIds) throws BizException {
        int num = 0;
        if (newsIds!=null){
            for (Long newsId:newsIds){
                num = newsTrendsMapper.deleteByPrimaryKey(newsId);
            }
        }

        return num;
    }

    @Override
    public Integer updateStatusById(Long newsId) throws BizException {
        return newsTrendsMapper.updateStatusById(newsId);
    }

    @Override
    public Integer updateFirstShowById(Long newsId) throws BizException {
        return newsTrendsMapper.updateFirstShowById(newsId);
    }

    @Override
    public List<NewsTrends> showFrontNewsTrend() throws BizException {
        return newsTrendsMapper.showFrontNewsTrend();
    }
}
