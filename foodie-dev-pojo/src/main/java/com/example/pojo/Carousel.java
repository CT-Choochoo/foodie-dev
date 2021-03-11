package com.example.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

/**
    * 轮播图
    */
@TableName(value = "carousel")
public class Carousel implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.INPUT)
    private String id;

    /**
     * 图片 图片地址
     */
    @TableField(value = "image_url")
    private String imageUrl;

    /**
     * 背景色
     */
    @TableField(value = "background_color")
    private String backgroundColor;

    /**
     * 商品id 商品id
     */
    @TableField(value = "item_id")
    private String itemId;

    /**
     * 商品分类id 商品分类id
     */
    @TableField(value = "cat_id")
    private String catId;

    /**
     * 轮播图类型 轮播图类型，用于判断，可以根据商品id或者分类进行页面跳转，1：商品 2：分类
     */
    @TableField(value = "type")
    private Integer type;

    /**
     * 轮播图展示顺序
     */
    @TableField(value = "sort")
    private Integer sort;

    /**
     * 是否展示
     */
    @TableField(value = "is_show")
    private Integer isShow;

    /**
     * 创建时间 创建时间
     */
    @TableField(value = "create_time")
    private LocalDateTime createTime;

    /**
     * 更新时间 更新
     */
    @TableField(value = "update_time")
    private LocalDateTime updateTime;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_IMAGE_URL = "image_url";

    public static final String COL_BACKGROUND_COLOR = "background_color";

    public static final String COL_ITEM_ID = "item_id";

    public static final String COL_CAT_ID = "cat_id";

    public static final String COL_TYPE = "type";

    public static final String COL_SORT = "sort";

    public static final String COL_IS_SHOW = "is_show";

    public static final String COL_CREATE_TIME = "create_time";

    public static final String COL_UPDATE_TIME = "update_time";

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public String getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 获取图片 图片地址
     *
     * @return image_url - 图片 图片地址
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * 设置图片 图片地址
     *
     * @param imageUrl 图片 图片地址
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl == null ? null : imageUrl.trim();
    }

    /**
     * 获取背景色
     *
     * @return background_color - 背景色
     */
    public String getBackgroundColor() {
        return backgroundColor;
    }

    /**
     * 设置背景色
     *
     * @param backgroundColor 背景色
     */
    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor == null ? null : backgroundColor.trim();
    }

    /**
     * 获取商品id 商品id
     *
     * @return item_id - 商品id 商品id
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * 设置商品id 商品id
     *
     * @param itemId 商品id 商品id
     */
    public void setItemId(String itemId) {
        this.itemId = itemId == null ? null : itemId.trim();
    }

    /**
     * 获取商品分类id 商品分类id
     *
     * @return cat_id - 商品分类id 商品分类id
     */
    public String getCatId() {
        return catId;
    }

    /**
     * 设置商品分类id 商品分类id
     *
     * @param catId 商品分类id 商品分类id
     */
    public void setCatId(String catId) {
        this.catId = catId == null ? null : catId.trim();
    }

    /**
     * 获取轮播图类型 轮播图类型，用于判断，可以根据商品id或者分类进行页面跳转，1：商品 2：分类
     *
     * @return type - 轮播图类型 轮播图类型，用于判断，可以根据商品id或者分类进行页面跳转，1：商品 2：分类
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置轮播图类型 轮播图类型，用于判断，可以根据商品id或者分类进行页面跳转，1：商品 2：分类
     *
     * @param type 轮播图类型 轮播图类型，用于判断，可以根据商品id或者分类进行页面跳转，1：商品 2：分类
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取轮播图展示顺序
     *
     * @return sort - 轮播图展示顺序
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 设置轮播图展示顺序
     *
     * @param sort 轮播图展示顺序
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * 获取是否展示
     *
     * @return is_show - 是否展示
     */
    public Integer getIsShow() {
        return isShow;
    }

    /**
     * 设置是否展示
     *
     * @param isShow 是否展示
     */
    public void setIsShow(Integer isShow) {
        this.isShow = isShow;
    }

    /**
     * 获取创建时间 创建时间
     *
     * @return create_time - 创建时间 创建时间
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间 创建时间
     *
     * @param createTime 创建时间 创建时间
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取更新时间 更新
     *
     * @return update_time - 更新时间 更新
     */
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间 更新
     *
     * @param updateTime 更新时间 更新
     */
    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }
}
