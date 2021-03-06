package com.yqwl.dao;

import com.yqwl.pojo.SystemSetting;

import java.util.List;

public interface SystemSettingMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_system_setting
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_system_setting
     *
     * @mbg.generated
     */
    int insert(SystemSetting record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_system_setting
     *
     * @mbg.generated
     */
    int insertSelective(SystemSetting record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_system_setting
     *
     * @mbg.generated
     */
    SystemSetting selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_system_setting
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(SystemSetting record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_system_setting
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(SystemSetting record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_system_setting
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(SystemSetting record);

    /**根据键查询值*/
    String selectByKey(String key);

    List<SystemSetting> listAll();
}