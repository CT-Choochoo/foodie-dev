package com.example.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

/**
    * 用户地址表
    */
@TableName(value = "user_address")
public class UserAddress implements Serializable {
    /**
     * 地址主键id
     */
    @TableId(value = "id", type = IdType.INPUT)
    private String id;

    /**
     * 关联用户id
     */
    @TableField(value = "user_id")
    private String userId;

    /**
     * 收件人姓名
     */
    @TableField(value = "receiver")
    private String receiver;

    /**
     * 收件人手机号
     */
    @TableField(value = "mobile")
    private String mobile;

    /**
     * 省份
     */
    @TableField(value = "province")
    private String province;

    /**
     * 城市
     */
    @TableField(value = "city")
    private String city;

    /**
     * 区县
     */
    @TableField(value = "district")
    private String district;

    /**
     * 详细地址
     */
    @TableField(value = "detail")
    private String detail;

    /**
     * 扩展字段
     */
    @TableField(value = "extand")
    private String extand;

    /**
     * 是否默认地址
     */
    @TableField(value = "is_default")
    private Integer isDefault;

    /**
     * 创建时间
     */
    @TableField(value = "created_time")
    private LocalDateTime createdTime;

    /**
     * 更新时间
     */
    @TableField(value = "updated_time")
    private LocalDateTime updatedTime;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_USER_ID = "user_id";

    public static final String COL_RECEIVER = "receiver";

    public static final String COL_MOBILE = "mobile";

    public static final String COL_PROVINCE = "province";

    public static final String COL_CITY = "city";

    public static final String COL_DISTRICT = "district";

    public static final String COL_DETAIL = "detail";

    public static final String COL_EXTAND = "extand";

    public static final String COL_IS_DEFAULT = "is_default";

    public static final String COL_CREATED_TIME = "created_time";

    public static final String COL_UPDATED_TIME = "updated_time";

    /**
     * 获取地址主键id
     *
     * @return id - 地址主键id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置地址主键id
     *
     * @param id 地址主键id
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 获取关联用户id
     *
     * @return user_id - 关联用户id
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置关联用户id
     *
     * @param userId 关联用户id
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * 获取收件人姓名
     *
     * @return receiver - 收件人姓名
     */
    public String getReceiver() {
        return receiver;
    }

    /**
     * 设置收件人姓名
     *
     * @param receiver 收件人姓名
     */
    public void setReceiver(String receiver) {
        this.receiver = receiver == null ? null : receiver.trim();
    }

    /**
     * 获取收件人手机号
     *
     * @return mobile - 收件人手机号
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置收件人手机号
     *
     * @param mobile 收件人手机号
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * 获取省份
     *
     * @return province - 省份
     */
    public String getProvince() {
        return province;
    }

    /**
     * 设置省份
     *
     * @param province 省份
     */
    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    /**
     * 获取城市
     *
     * @return city - 城市
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置城市
     *
     * @param city 城市
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * 获取区县
     *
     * @return district - 区县
     */
    public String getDistrict() {
        return district;
    }

    /**
     * 设置区县
     *
     * @param district 区县
     */
    public void setDistrict(String district) {
        this.district = district == null ? null : district.trim();
    }

    /**
     * 获取详细地址
     *
     * @return detail - 详细地址
     */
    public String getDetail() {
        return detail;
    }

    /**
     * 设置详细地址
     *
     * @param detail 详细地址
     */
    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

    /**
     * 获取扩展字段
     *
     * @return extand - 扩展字段
     */
    public String getExtand() {
        return extand;
    }

    /**
     * 设置扩展字段
     *
     * @param extand 扩展字段
     */
    public void setExtand(String extand) {
        this.extand = extand == null ? null : extand.trim();
    }

    /**
     * 获取是否默认地址
     *
     * @return is_default - 是否默认地址
     */
    public Integer getIsDefault() {
        return isDefault;
    }

    /**
     * 设置是否默认地址
     *
     * @param isDefault 是否默认地址
     */
    public void setIsDefault(Integer isDefault) {
        this.isDefault = isDefault;
    }

    /**
     * 获取创建时间
     *
     * @return created_time - 创建时间
     */
    public LocalDateTime getCreatedTime() {
        return createdTime;
    }

    /**
     * 设置创建时间
     *
     * @param createdTime 创建时间
     */
    public void setCreatedTime(LocalDateTime createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * 获取更新时间
     *
     * @return updated_time - 更新时间
     */
    public LocalDateTime getUpdatedTime() {
        return updatedTime;
    }

    /**
     * 设置更新时间
     *
     * @param updatedTime 更新时间
     */
    public void setUpdatedTime(LocalDateTime updatedTime) {
        this.updatedTime = updatedTime;
    }
}
