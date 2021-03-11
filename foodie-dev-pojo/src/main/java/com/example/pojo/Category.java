package com.example.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
    * 商品分类 
    */
@TableName(value = "category")
public class Category implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 分类名称
     */
    @TableField(value = "name")
    private String name;

    /**
     * 分类类型
     */
    @TableField(value = "type")
    private Integer type;

    /**
     * 父id
     */
    @TableField(value = "father_id")
    private Integer fatherId;

    /**
     * 图标
     */
    @TableField(value = "logo")
    private String logo;

    /**
     * 口号
     */
    @TableField(value = "slogan")
    private String slogan;

    /**
     * 分类图
     */
    @TableField(value = "cat_image")
    private String catImage;

    /**
     * 背景颜色
     */
    @TableField(value = "bg_color")
    private String bgColor;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_NAME = "name";

    public static final String COL_TYPE = "type";

    public static final String COL_FATHER_ID = "father_id";

    public static final String COL_LOGO = "logo";

    public static final String COL_SLOGAN = "slogan";

    public static final String COL_CAT_IMAGE = "cat_image";

    public static final String COL_BG_COLOR = "bg_color";

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取分类名称
     *
     * @return name - 分类名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置分类名称
     *
     * @param name 分类名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取分类类型
     *
     * @return type - 分类类型
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置分类类型
     *
     * @param type 分类类型
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取父id
     *
     * @return father_id - 父id
     */
    public Integer getFatherId() {
        return fatherId;
    }

    /**
     * 设置父id
     *
     * @param fatherId 父id
     */
    public void setFatherId(Integer fatherId) {
        this.fatherId = fatherId;
    }

    /**
     * 获取图标
     *
     * @return logo - 图标
     */
    public String getLogo() {
        return logo;
    }

    /**
     * 设置图标
     *
     * @param logo 图标
     */
    public void setLogo(String logo) {
        this.logo = logo == null ? null : logo.trim();
    }

    /**
     * 获取口号
     *
     * @return slogan - 口号
     */
    public String getSlogan() {
        return slogan;
    }

    /**
     * 设置口号
     *
     * @param slogan 口号
     */
    public void setSlogan(String slogan) {
        this.slogan = slogan == null ? null : slogan.trim();
    }

    /**
     * 获取分类图
     *
     * @return cat_image - 分类图
     */
    public String getCatImage() {
        return catImage;
    }

    /**
     * 设置分类图
     *
     * @param catImage 分类图
     */
    public void setCatImage(String catImage) {
        this.catImage = catImage == null ? null : catImage.trim();
    }

    /**
     * 获取背景颜色
     *
     * @return bg_color - 背景颜色
     */
    public String getBgColor() {
        return bgColor;
    }

    /**
     * 设置背景颜色
     *
     * @param bgColor 背景颜色
     */
    public void setBgColor(String bgColor) {
        this.bgColor = bgColor == null ? null : bgColor.trim();
    }
}