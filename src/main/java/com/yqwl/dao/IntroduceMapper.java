package com.yqwl.dao;

import com.yqwl.pojo.Introduce;

public interface IntroduceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_introduce
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_introduce
     *
     * @mbggenerated
     */
    int insert(Introduce record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_introduce
     *
     * @mbggenerated
     */
    int insertSelective(Introduce record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_introduce
     *
     * @mbggenerated
     */
    Introduce selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_introduce
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Introduce record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_introduce
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Introduce record);

    Introduce introduce();
}