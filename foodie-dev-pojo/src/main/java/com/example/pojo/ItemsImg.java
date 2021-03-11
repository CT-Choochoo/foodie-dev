package com.example.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

/**
    * 商品图片
    */
@TableName(value = "items_img")
public class ItemsImg implements Serializable {
    /**
     * 图片主键
     */
    @TableId(value = "id", type = IdType.INPUT)
    private String id;

    /**
     * 商品外键id 商品外键id
     */
    @TableField(value = "item_id")
    private String itemId;

    /**
     * 图片地址 图片地址
     */
    @TableField(value = "url")
    private String url;

    /**
     * 顺序 图片顺序，从小到大
     */
    @TableField(value = "sort")
    private Integer sort;

    /**
     * 是否主图 是否主图，1：是，0：否
     */
    @TableField(value = "is_main")
    private Integer isMain;

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

    public static final String COL_URL = "url";

    public static final String COL_SORT = "sort";

    public static final String COL_IS_MAIN = "is_main";

    public static final String COL_CREATED_TIME = "created_time";

    public static final String COL_UPDATED_TIME = "updated_time";

    /**
     * 获取图片主键
     *
     * @return id - 图片主键
     */
    public String getId() {
        return id;
    }

    /**
     * 设置图片主键
     *
     * @param id 图片主键
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 获取商品外键id 商品外键id
     *
     * @return item_id - 商品外键id 商品外键id
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * 设置商品外键id 商品外键id
     *
     * @param itemId 商品外键id 商品外键id
     */
    public void setItemId(String itemId) {
        this.itemId = itemId == null ? null : itemId.trim();
    }

    /**
     * 获取图片地址 图片地址
     *
     * @return url - 图片地址 图片地址
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置图片地址 图片地址
     *
     * @param url 图片地址 图片地址
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * 获取顺序 图片顺序，从小到大
     *
     * @return sort - 顺序 图片顺序，从小到大
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 设置顺序 图片顺序，从小到大
     *
     * @param sort 顺序 图片顺序，从小到大
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * 获取是否主图 是否主图，1：是，0：否
     *
     * @return is_main - 是否主图 是否主图，1：是，0：否
     */
    public Integer getIsMain() {
        return isMain;
    }

    /**
     * 设置是否主图 是否主图，1：是，0：否
     *
     * @param isMain 是否主图 是否主图，1：是，0：否
     */
    public void setIsMain(Integer isMain) {
        this.isMain = isMain;
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
