package com.example.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

/**
    * 商品评价表
    */
@TableName(value = "items_comments")
public class ItemsComments implements Serializable {
    /**
     * id主键
     */
    @TableId(value = "id", type = IdType.INPUT)
    private String id;

    /**
     * 用户id 用户名须脱敏
     */
    @TableField(value = "user_id")
    private String userId;

    /**
     * 商品id
     */
    @TableField(value = "item_id")
    private String itemId;

    /**
     * 商品名称
     */
    @TableField(value = "item_name")
    private String itemName;

    /**
     * 商品规格id 可为空
     */
    @TableField(value = "item_spec_id")
    private String itemSpecId;

    /**
     * 规格名称 可为空
     */
    @TableField(value = "sepc_name")
    private String sepcName;

    /**
     * 评价等级 1：好评 2：中评 3：差评
     */
    @TableField(value = "comment_level")
    private Integer commentLevel;

    /**
     * 评价内容
     */
    @TableField(value = "content")
    private String content;

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

    public static final String COL_ITEM_ID = "item_id";

    public static final String COL_ITEM_NAME = "item_name";

    public static final String COL_ITEM_SPEC_ID = "item_spec_id";

    public static final String COL_SEPC_NAME = "sepc_name";

    public static final String COL_COMMENT_LEVEL = "comment_level";

    public static final String COL_CONTENT = "content";

    public static final String COL_CREATED_TIME = "created_time";

    public static final String COL_UPDATED_TIME = "updated_time";

    /**
     * 获取id主键
     *
     * @return id - id主键
     */
    public String getId() {
        return id;
    }

    /**
     * 设置id主键
     *
     * @param id id主键
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 获取用户id 用户名须脱敏
     *
     * @return user_id - 用户id 用户名须脱敏
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置用户id 用户名须脱敏
     *
     * @param userId 用户id 用户名须脱敏
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * 获取商品id
     *
     * @return item_id - 商品id
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * 设置商品id
     *
     * @param itemId 商品id
     */
    public void setItemId(String itemId) {
        this.itemId = itemId == null ? null : itemId.trim();
    }

    /**
     * 获取商品名称
     *
     * @return item_name - 商品名称
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * 设置商品名称
     *
     * @param itemName 商品名称
     */
    public void setItemName(String itemName) {
        this.itemName = itemName == null ? null : itemName.trim();
    }

    /**
     * 获取商品规格id 可为空
     *
     * @return item_spec_id - 商品规格id 可为空
     */
    public String getItemSpecId() {
        return itemSpecId;
    }

    /**
     * 设置商品规格id 可为空
     *
     * @param itemSpecId 商品规格id 可为空
     */
    public void setItemSpecId(String itemSpecId) {
        this.itemSpecId = itemSpecId == null ? null : itemSpecId.trim();
    }

    /**
     * 获取规格名称 可为空
     *
     * @return sepc_name - 规格名称 可为空
     */
    public String getSepcName() {
        return sepcName;
    }

    /**
     * 设置规格名称 可为空
     *
     * @param sepcName 规格名称 可为空
     */
    public void setSepcName(String sepcName) {
        this.sepcName = sepcName == null ? null : sepcName.trim();
    }

    /**
     * 获取评价等级 1：好评 2：中评 3：差评
     *
     * @return comment_level - 评价等级 1：好评 2：中评 3：差评
     */
    public Integer getCommentLevel() {
        return commentLevel;
    }

    /**
     * 设置评价等级 1：好评 2：中评 3：差评
     *
     * @param commentLevel 评价等级 1：好评 2：中评 3：差评
     */
    public void setCommentLevel(Integer commentLevel) {
        this.commentLevel = commentLevel;
    }

    /**
     * 获取评价内容
     *
     * @return content - 评价内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置评价内容
     *
     * @param content 评价内容
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
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
