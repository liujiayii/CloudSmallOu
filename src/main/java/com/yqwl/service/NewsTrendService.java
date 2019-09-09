package com.yqwl.service;/**
 * Created by Administrator on 2019/9/4.
 */

import com.github.pagehelper.PageInfo;
import com.yqwl.common.utils.Pager;
import com.yqwl.common.web.BizException;
import com.yqwl.pojo.NewsTrends;

import java.util.List;

/**
 * @author LiuHangjing
 * @date 2019/9/4 13:50
 */
public interface NewsTrendService {

    Integer insertNewsTrend(NewsTrends newsTrends,Long orderTime) throws BizException;

    Integer updateNewsTrend(NewsTrends newsTrends,Long orderTime) throws BizException;

    PageInfo<NewsTrends> showListNewsTrend(Pager pager) throws BizException;

    Integer deleteNewsTrend(Long newsId) throws BizException;

    Integer deleteSelectNewsTrend(Long... newsIds) throws BizException;

    Integer updateStatusById(Long newsId) throws BizException;

    Integer updateFirstShowById(Long newsId) throws BizException;

    List<NewsTrends> showFrontNewsTrend() throws BizException;
}
