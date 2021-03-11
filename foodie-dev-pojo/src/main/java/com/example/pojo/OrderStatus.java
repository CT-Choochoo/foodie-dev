package com.example.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * 订单状态表;订单的每个状态更改都需要进行记录 10：待付款 20：已付款，待发货 30：已发货，待收货（7天自动确认） 40：交易成功（此时可以评价）50：交易关闭（待付款时，用户取消 或
 * 长时间未付款，系统识别后自动关闭） 退货/退货，此分支流程不做，所以不加入
 */
@TableName(value = "order_status")
public class OrderStatus implements Serializable {
  /** 订单ID;对应订单表的主键id */
  @TableId(value = "order_id", type = IdType.INPUT)
  private String orderId;

  /** 订单状态 */
  @TableField(value = "order_status")
  private Integer orderStatus;

  /** 订单创建时间;对应[10:待付款]状态 */
  @TableField(value = "created_time")
  private LocalDateTime createdTime;

  /** 支付成功时间;对应[20:已付款，待发货]状态 */
  @TableField(value = "pay_time")
  private LocalDateTime payTime;

  /** 发货时间;对应[30：已发货，待收货]状态 */
  @TableField(value = "deliver_time")
  private LocalDateTime deliverTime;

  /** 交易成功时间;对应[40：交易成功]状态 */
  @TableField(value = "success_time")
  private LocalDateTime successTime;

  /** 交易关闭时间;对应[50：交易关闭]状态 */
  @TableField(value = "close_time")
  private LocalDateTime closeTime;

  /** 留言时间;用户在交易成功后的留言时间 */
  @TableField(value = "comment_time")
  private LocalDateTime commentTime;

  private static final long serialVersionUID = 1L;

  public static final String COL_ORDER_ID = "order_id";

  public static final String COL_ORDER_STATUS = "order_status";

  public static final String COL_CREATED_TIME = "created_time";

  public static final String COL_PAY_TIME = "pay_time";

  public static final String COL_DELIVER_TIME = "deliver_time";

  public static final String COL_SUCCESS_TIME = "success_time";

  public static final String COL_CLOSE_TIME = "close_time";

  public static final String COL_COMMENT_TIME = "comment_time";

  /**
   * 获取订单ID;对应订单表的主键id
   *
   * @return order_id - 订单ID;对应订单表的主键id
   */
  public String getOrderId() {
    return orderId;
  }

  /**
   * 设置订单ID;对应订单表的主键id
   *
   * @param orderId 订单ID;对应订单表的主键id
   */
  public void setOrderId(String orderId) {
    this.orderId = orderId == null ? null : orderId.trim();
  }

  /**
   * 获取订单状态
   *
   * @return order_status - 订单状态
   */
  public Integer getOrderStatus() {
    return orderStatus;
  }

  /**
   * 设置订单状态
   *
   * @param orderStatus 订单状态
   */
  public void setOrderStatus(Integer orderStatus) {
    this.orderStatus = orderStatus;
  }

  /**
   * 获取订单创建时间;对应[10:待付款]状态
   *
   * @return created_time - 订单创建时间;对应[10:待付款]状态
   */
  public LocalDateTime getCreatedTime() {
    return createdTime;
  }

  /**
   * 设置订单创建时间;对应[10:待付款]状态
   *
   * @param createdTime 订单创建时间;对应[10:待付款]状态
   */
  public void setCreatedTime(LocalDateTime createdTime) {
    this.createdTime = createdTime;
  }

  /**
   * 获取支付成功时间;对应[20:已付款，待发货]状态
   *
   * @return pay_time - 支付成功时间;对应[20:已付款，待发货]状态
   */
  public LocalDateTime getPayTime() {
    return payTime;
  }

  /**
   * 设置支付成功时间;对应[20:已付款，待发货]状态
   *
   * @param payTime 支付成功时间;对应[20:已付款，待发货]状态
   */
  public void setPayTime(LocalDateTime payTime) {
    this.payTime = payTime;
  }

  /**
   * 获取发货时间;对应[30：已发货，待收货]状态
   *
   * @return deliver_time - 发货时间;对应[30：已发货，待收货]状态
   */
  public LocalDateTime getDeliverTime() {
    return deliverTime;
  }

  /**
   * 设置发货时间;对应[30：已发货，待收货]状态
   *
   * @param deliverTime 发货时间;对应[30：已发货，待收货]状态
   */
  public void setDeliverTime(LocalDateTime deliverTime) {
    this.deliverTime = deliverTime;
  }

  /**
   * 获取交易成功时间;对应[40：交易成功]状态
   *
   * @return success_time - 交易成功时间;对应[40：交易成功]状态
   */
  public LocalDateTime getSuccessTime() {
    return successTime;
  }

  /**
   * 设置交易成功时间;对应[40：交易成功]状态
   *
   * @param successTime 交易成功时间;对应[40：交易成功]状态
   */
  public void setSuccessTime(LocalDateTime successTime) {
    this.successTime = successTime;
  }

  /**
   * 获取交易关闭时间;对应[50：交易关闭]状态
   *
   * @return close_time - 交易关闭时间;对应[50：交易关闭]状态
   */
  public LocalDateTime getCloseTime() {
    return closeTime;
  }

  /**
   * 设置交易关闭时间;对应[50：交易关闭]状态
   *
   * @param closeTime 交易关闭时间;对应[50：交易关闭]状态
   */
  public void setCloseTime(LocalDateTime closeTime) {
    this.closeTime = closeTime;
  }

  /**
   * 获取留言时间;用户在交易成功后的留言时间
   *
   * @return comment_time - 留言时间;用户在交易成功后的留言时间
   */
  public LocalDateTime getCommentTime() {
    return commentTime;
  }

  /**
   * 设置留言时间;用户在交易成功后的留言时间
   *
   * @param commentTime 留言时间;用户在交易成功后的留言时间
   */
  public void setCommentTime(LocalDateTime commentTime) {
    this.commentTime = commentTime;
  }
}
