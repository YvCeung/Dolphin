package com.zyg.dolphin.api.user.constant;

/**
 * @author zy
 */
public enum UserType {

    /**
     * 用户
     */
    CUSTOMER("用户"),

    /**
     * 平台
     */
    PLATFORM("平台");

    private String desc;

    UserType(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}