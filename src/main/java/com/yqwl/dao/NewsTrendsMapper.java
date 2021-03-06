package com.yqwl.dao;

import com.yqwl.pojo.NewsTrends;

import java.util.List;

public interface NewsTrendsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_news_trends
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_news_trends
     *
     * @mbggenerated
     */
    int insert(NewsTrends record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_news_trends
     *
     * @mbggenerated
     */
    int insertSelective(NewsTrends record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_news_trends
     *
     * @mbggenerated
     */
    NewsTrends selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_news_trends
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(NewsTrends record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_news_trends
     *
     * @mbggenerated
     */
    int updateByPrimaryKeyWithBLOBs(NewsTrends record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_news_trends
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(NewsTrends record);

    List<NewsTrends> showListNewsTrend();

    Integer updateStatusById(Long newsId);

    Integer updateFirstShowById(Long newsId);

    List<NewsTrends> homePage();

    List<NewsTrends> listByColumnProgramaId(int i);

    List<NewsTrends> showFrontNewsTrend();

    NewsTrends showNewsTrendById(Long id);
}