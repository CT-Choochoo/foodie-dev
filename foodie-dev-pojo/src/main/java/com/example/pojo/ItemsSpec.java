package com.example.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

/**
    * 商品规格 每一件商品都有不同的规格，不同的规格又有不同的价格和优惠力度，规格表为此设计
    */
@TableName(value = "items_spec")
public class ItemsSpec implements Serializable {
    /**
     * 商品规格id
     */
    @TableId(value = "id", type = IdType.INPUT)
    private String id;

    /**
     * 商品外键id
     */
    @TableField(value = "item_id")
    private String itemId;

    /**
     * 规格名称
     */
    @TableField(value = "name")
    private String name;

    /**
     * 库存
     */
    @TableField(value = "stock")
    private Integer stock;

    /**
     * 折扣力度
     */
    @TableField(value = "discounts")
    private BigDecimal discounts;

    /**
     * 优惠价
     */
    @TableField(value = "price_discount")
    private Integer priceDiscount;

    /**
     * 原价
     */
    @TableField(value = "price_normal")
    private Integer priceNormal;

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

    public static final String COL_ITEM_ID = "item_id";

    public static final String COL_NAME = "name";

    public static final String COL_STOCK = "stock";

    public static final String COL_DISCOUNTS = "discounts";

    public static final String COL_PRICE_DISCOUNT = "price_discount";

    public static final String COL_PRICE_NORMAL = "price_normal";

    public static final String COL_CREATED_TIME = "created_time";

    public static final String COL_UPDATED_TIME = "updated_time";

    /**
     * 获取商品规格id
     *
     * @return id - 商品规格id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置商品规格id
     *
     * @param id 商品规格id
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 获取商品外键id
     *
     * @return item_id - 商品外键id
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * 设置商品外键id
     *
     * @param itemId 商品外键id
     */
    public void setItemId(String itemId) {
        this.itemId = itemId == null ? null : itemId.trim();
    }

    /**
     * 获取规格名称
     *
     * @return name - 规格名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置规格名称
     *
     * @param name 规格名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取库存
     *
     * @return stock - 库存
     */
    public Integer getStock() {
        return stock;
    }

    /**
     * 设置库存
     *
     * @param stock 库存
     */
    public void setStock(Integer stock) {
        this.stock = stock;
    }

    /**
     * 获取折扣力度
     *
     * @return discounts - 折扣力度
     */
    public BigDecimal getDiscounts() {
        return discounts;
    }

    /**
     * 设置折扣力度
     *
     * @param discounts 折扣力度
     */
    public void setDiscounts(BigDecimal discounts) {
        this.discounts = discounts;
    }

    /**
     * 获取优惠价
     *
     * @return price_discount - 优惠价
     */
    public Integer getPriceDiscount() {
        return priceDiscount;
    }

    /**
     * 设置优惠价
     *
     * @param priceDiscount 优惠价
     */
    public void setPriceDiscount(Integer priceDiscount) {
        this.priceDiscount = priceDiscount;
    }

    /**
     * 获取原价
     *
     * @return price_normal - 原价
     */
    public Integer getPriceNormal() {
        return priceNormal;
    }

    /**
     * 设置原价
     *
     * @param priceNormal 原价
     */
    public void setPriceNormal(Integer priceNormal) {
        this.priceNormal = priceNormal;
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
