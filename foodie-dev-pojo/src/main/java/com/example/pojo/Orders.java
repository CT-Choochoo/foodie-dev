package com.example.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

/**
    * 订单表;
    */
@TableName(value = "orders")
public class Orders implements Serializable {
    /**
     * 订单主键;同时也是订单编号
     */
    @TableId(value = "id", type = IdType.INPUT)
    private String id;

    /**
     * 用户id
     */
    @TableField(value = "user_id")
    private String userId;

    /**
     * 收货人快照
     */
    @TableField(value = "receiver_name")
    private String receiverName;

    /**
     * 收货人手机号快照
     */
    @TableField(value = "receiver_mobile")
    private String receiverMobile;

    /**
     * 收货地址快照
     */
    @TableField(value = "receiver_address")
    private String receiverAddress;

    /**
     * 订单总价格
     */
    @TableField(value = "total_amount")
    private Integer totalAmount;

    /**
     * 实际支付总价格
     */
    @TableField(value = "real_pay_amount")
    private Integer realPayAmount;

    /**
     * 邮费;默认可以为零，代表包邮
     */
    @TableField(value = "post_amount")
    private Integer postAmount;

    /**
     * 支付方式
     */
    @TableField(value = "pay_method")
    private Integer payMethod;

    /**
     * 买家留言
     */
    @TableField(value = "left_msg")
    private String leftMsg;

    /**
     * 扩展字段
     */
    @TableField(value = "extand")
    private String extand;

    /**
     * 买家是否评价;1：已评价，0：未评价
     */
    @TableField(value = "is_comment")
    private Integer isComment;

    /**
     * 逻辑删除状态;1: 删除 0:未删除
     */
    @TableField(value = "is_delete")
    private Integer isDelete;

    /**
     * 创建时间（成交时间）
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

    public static final String COL_RECEIVER_NAME = "receiver_name";

    public static final String COL_RECEIVER_MOBILE = "receiver_mobile";

    public static final String COL_RECEIVER_ADDRESS = "receiver_address";

    public static final String COL_TOTAL_AMOUNT = "total_amount";

    public static final String COL_REAL_PAY_AMOUNT = "real_pay_amount";

    public static final String COL_POST_AMOUNT = "post_amount";

    public static final String COL_PAY_METHOD = "pay_method";

    public static final String COL_LEFT_MSG = "left_msg";

    public static final String COL_EXTAND = "extand";

    public static final String COL_IS_COMMENT = "is_comment";

    public static final String COL_IS_DELETE = "is_delete";

    public static final String COL_CREATED_TIME = "created_time";

    public static final String COL_UPDATED_TIME = "updated_time";

    /**
     * 获取订单主键;同时也是订单编号
     *
     * @return id - 订单主键;同时也是订单编号
     */
    public String getId() {
        return id;
    }

    /**
     * 设置订单主键;同时也是订单编号
     *
     * @param id 订单主键;同时也是订单编号
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 获取用户id
     *
     * @return user_id - 用户id
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置用户id
     *
     * @param userId 用户id
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * 获取收货人快照
     *
     * @return receiver_name - 收货人快照
     */
    public String getReceiverName() {
        return receiverName;
    }

    /**
     * 设置收货人快照
     *
     * @param receiverName 收货人快照
     */
    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName == null ? null : receiverName.trim();
    }

    /**
     * 获取收货人手机号快照
     *
     * @return receiver_mobile - 收货人手机号快照
     */
    public String getReceiverMobile() {
        return receiverMobile;
    }

    /**
     * 设置收货人手机号快照
     *
     * @param receiverMobile 收货人手机号快照
     */
    public void setReceiverMobile(String receiverMobile) {
        this.receiverMobile = receiverMobile == null ? null : receiverMobile.trim();
    }

    /**
     * 获取收货地址快照
     *
     * @return receiver_address - 收货地址快照
     */
    public String getReceiverAddress() {
        return receiverAddress;
    }

    /**
     * 设置收货地址快照
     *
     * @param receiverAddress 收货地址快照
     */
    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress == null ? null : receiverAddress.trim();
    }

    /**
     * 获取订单总价格
     *
     * @return total_amount - 订单总价格
     */
    public Integer getTotalAmount() {
        return totalAmount;
    }

    /**
     * 设置订单总价格
     *
     * @param totalAmount 订单总价格
     */
    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * 获取实际支付总价格
     *
     * @return real_pay_amount - 实际支付总价格
     */
    public Integer getRealPayAmount() {
        return realPayAmount;
    }

    /**
     * 设置实际支付总价格
     *
     * @param realPayAmount 实际支付总价格
     */
    public void setRealPayAmount(Integer realPayAmount) {
        this.realPayAmount = realPayAmount;
    }

    /**
     * 获取邮费;默认可以为零，代表包邮
     *
     * @return post_amount - 邮费;默认可以为零，代表包邮
     */
    public Integer getPostAmount() {
        return postAmount;
    }

    /**
     * 设置邮费;默认可以为零，代表包邮
     *
     * @param postAmount 邮费;默认可以为零，代表包邮
     */
    public void setPostAmount(Integer postAmount) {
        this.postAmount = postAmount;
    }

    /**
     * 获取支付方式
     *
     * @return pay_method - 支付方式
     */
    public Integer getPayMethod() {
        return payMethod;
    }

    /**
     * 设置支付方式
     *
     * @param payMethod 支付方式
     */
    public void setPayMethod(Integer payMethod) {
        this.payMethod = payMethod;
    }

    /**
     * 获取买家留言
     *
     * @return left_msg - 买家留言
     */
    public String getLeftMsg() {
        return leftMsg;
    }

    /**
     * 设置买家留言
     *
     * @param leftMsg 买家留言
     */
    public void setLeftMsg(String leftMsg) {
        this.leftMsg = leftMsg == null ? null : leftMsg.trim();
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
     * 获取买家是否评价;1：已评价，0：未评价
     *
     * @return is_comment - 买家是否评价;1：已评价，0：未评价
     */
    public Integer getIsComment() {
        return isComment;
    }

    /**
     * 设置买家是否评价;1：已评价，0：未评价
     *
     * @param isComment 买家是否评价;1：已评价，0：未评价
     */
    public void setIsComment(Integer isComment) {
        this.isComment = isComment;
    }

    /**
     * 获取逻辑删除状态;1: 删除 0:未删除
     *
     * @return is_delete - 逻辑删除状态;1: 删除 0:未删除
     */
    public Integer getIsDelete() {
        return isDelete;
    }

    /**
     * 设置逻辑删除状态;1: 删除 0:未删除
     *
     * @param isDelete 逻辑删除状态;1: 删除 0:未删除
     */
    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * 获取创建时间（成交时间）
     *
     * @return created_time - 创建时间（成交时间）
     */
    public LocalDateTime getCreatedTime() {
        return createdTime;
    }

    /**
     * 设置创建时间（成交时间）
     *
     * @param createdTime 创建时间（成交时间）
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
