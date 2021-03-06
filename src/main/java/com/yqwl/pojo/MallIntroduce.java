package com.yqwl.pojo;

import java.io.Serializable;
import java.util.Date;

public class MallIntroduce implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mall_introduce.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mall_introduce.title
     *
     * @mbg.generated
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mall_introduce.line_busiess
     *
     * @mbg.generated
     */
    private String line_busiess;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mall_introduce.time
     *
     * @mbg.generated
     */
    private Date time;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mall_introduce.content
     *
     * @mbg.generated
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_mall_introduce
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mall_introduce.id
     *
     * @return the value of t_mall_introduce.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mall_introduce.id
     *
     * @param id the value for t_mall_introduce.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mall_introduce.title
     *
     * @return the value of t_mall_introduce.title
     *
     * @mbg.generated
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mall_introduce.title
     *
     * @param title the value for t_mall_introduce.title
     *
     * @mbg.generated
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mall_introduce.line_busiess
     *
     * @return the value of t_mall_introduce.line_busiess
     *
     * @mbg.generated
     */
    public String getLine_busiess() {
        return line_busiess;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mall_introduce.line_busiess
     *
     * @param line_busiess the value for t_mall_introduce.line_busiess
     *
     * @mbg.generated
     */
    public void setLine_busiess(String line_busiess) {
        this.line_busiess = line_busiess == null ? null : line_busiess.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mall_introduce.time
     *
     * @return the value of t_mall_introduce.time
     *
     * @mbg.generated
     */
    public Date getTime() {
        return time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mall_introduce.time
     *
     * @param time the value for t_mall_introduce.time
     *
     * @mbg.generated
     */
    public void setTime(Date time) {
        this.time = time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mall_introduce.content
     *
     * @return the value of t_mall_introduce.content
     *
     * @mbg.generated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mall_introduce.content
     *
     * @param content the value for t_mall_introduce.content
     *
     * @mbg.generated
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_introduce
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
        MallIntroduce other = (MallIntroduce) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getLine_busiess() == null ? other.getLine_busiess() == null : this.getLine_busiess().equals(other.getLine_busiess()))
            && (this.getTime() == null ? other.getTime() == null : this.getTime().equals(other.getTime()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_introduce
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getLine_busiess() == null) ? 0 : getLine_busiess().hashCode());
        result = prime * result + ((getTime() == null) ? 0 : getTime().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_introduce
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
        sb.append(", title=").append(title);
        sb.append(", line_busiess=").append(line_busiess);
        sb.append(", time=").append(time);
        sb.append(", content=").append(content);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}