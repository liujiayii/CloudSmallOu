package com.yqwl.vo;

import com.yqwl.pojo.*;

import java.util.List;
import java.util.Map;

public class HomePage {
    private List<Brand> brands;
    private List<Merchant> merchant;
    private Map<String, Object> newsTrends;
    private Introduce introduce;
    private List<SystemSetting> systemSetting;

    public List<Brand> getBrands() {
        return brands;
    }

    public void setBrands(List<Brand> brands) {
        this.brands = brands;
    }

    public List<Merchant> getMerchant() {
        return merchant;
    }

    public void setMerchant(List<Merchant> merchant) {
        this.merchant = merchant;
    }

    public Map<String, Object> getNewsTrends() {
        return newsTrends;
    }

    public void setNewsTrends(Map<String, Object> newsTrends) {
        this.newsTrends = newsTrends;
    }

    public Introduce getIntroduce() {
        return introduce;
    }

    public void setIntroduce(Introduce introduce) {
        this.introduce = introduce;
    }

    public List<SystemSetting> getSystemSetting() {
        return systemSetting;
    }

    public void setSystemSetting(List<SystemSetting> systemSetting) {
        this.systemSetting = systemSetting;
    }

    @Override
    public String toString() {
        return "HomePage{" +
                "brands=" + brands +
                ", merchant=" + merchant +
                ", newsTrends=" + newsTrends +
                ", introduce=" + introduce +
                ", systemSetting=" + systemSetting +
                '}';
    }
}
