package com.yqwl.pojo;

import java.io.Serializable;

public class SystemSetting implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_setting.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_setting.keyk
     *
     * @mbg.generated
     */
    private String keyk;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_setting.remark
     *
     * @mbg.generated
     */
    private String remark;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_setting.valuek
     *
     * @mbg.generated
     */
    private String valuek;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_system_setting
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_setting.id
     *
     * @return the value of t_system_setting.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_setting.id
     *
     * @param id the value for t_system_setting.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_setting.keyk
     *
     * @return the value of t_system_setting.keyk
     *
     * @mbg.generated
     */
    public String getKeyk() {
        return keyk;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_setting.keyk
     *
     * @param keyk the value for t_system_setting.keyk
     *
     * @mbg.generated
     */
    public void setKeyk(String keyk) {
        this.keyk = keyk == null ? null : keyk.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_setting.remark
     *
     * @return the value of t_system_setting.remark
     *
     * @mbg.generated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_setting.remark
     *
     * @param remark the value for t_system_setting.remark
     *
     * @mbg.generated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_setting.valuek
     *
     * @return the value of t_system_setting.valuek
     *
     * @mbg.generated
     */
    public String getValuek() {
        return valuek;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_setting.valuek
     *
     * @param valuek the value for t_system_setting.valuek
     *
     * @mbg.generated
     */
    public void setValuek(String valuek) {
        this.valuek = valuek == null ? null : valuek.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_system_setting
     *
     * @mbg.generated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        SystemSetting other = (SystemSetting) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getKeyk() == null ? other.getKeyk() == null : this.getKeyk().equals(other.getKeyk()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getValuek() == null ? other.getValuek() == null : this.getValuek().equals(other.getValuek()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_system_setting
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getKeyk() == null) ? 0 : getKeyk().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getValuek() == null) ? 0 : getValuek().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_system_setting
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", keyk=").append(keyk);
        sb.append(", remark=").append(remark);
        sb.append(", valuek=").append(valuek);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}