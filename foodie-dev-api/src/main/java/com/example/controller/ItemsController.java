package com.example.controller;

import com.example.pojo.Items;
import com.example.pojo.ItemsImg;
import com.example.pojo.ItemsParam;
import com.example.pojo.ItemsSpec;
import com.example.service.ItemsService;
import com.example.utils.JSONResult;
import com.example.utils.PagedGridResult;
import com.example.vo.CommentLevelCountsVO;
import com.example.vo.ItemInfoVO;
import com.example.vo.ShopcartVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Api(
    value = "商品接口",
    tags = {"商品信息展示的相关接口"})
@RestController
@RequestMapping("items")
public class ItemsController {
  public static final Integer COMMON_PAGE_SIZE = 10;
  public static final Integer PAGE_SIZE = 20;
  @Autowired private ItemsService itemService;

  @ApiOperation(value = "查询商品详情", notes = "查询商品详情", httpMethod = "GET")
  @GetMapping("/info/{itemId}")
  public JSONResult info(
      @ApiParam(name = "itemId", value = "商品id", required = true) @PathVariable String itemId) {

    if (StringUtils.isBlank(itemId)) {
      return JSONResult.errorMsg(null);
    }

    Items item = itemService.queryItemById(itemId);
    List<ItemsImg> itemImgList = itemService.queryItemImgList(itemId);
    List<ItemsSpec> itemsSpecList = itemService.queryItemSpecList(itemId);
    ItemsParam itemsParam = itemService.queryItemParam(itemId);

    ItemInfoVO itemInfoVO = new ItemInfoVO();
    itemInfoVO.setItem(item);
    itemInfoVO.setItemImgList(itemImgList);
    itemInfoVO.setItemSpecList(itemsSpecList);
    itemInfoVO.setItemParams(itemsParam);

    return JSONResult.ok(itemInfoVO);
  }

  @ApiOperation(value = "查询商品评价等级", notes = "查询商品评价等级", httpMethod = "GET")
  @GetMapping("/commentLevel")
  public JSONResult commentLevel(
      @ApiParam(name = "itemId", value = "商品id", required = true) @RequestParam String itemId) {

    if (StringUtils.isBlank(itemId)) {
      return JSONResult.errorMsg(null);
    }

    CommentLevelCountsVO countsVO = itemService.queryCommentCounts(itemId);

    return JSONResult.ok(countsVO);
  }

  @ApiOperation(value = "查询商品评论", notes = "查询商品评论", httpMethod = "GET")
  @GetMapping("/comments")
  public JSONResult comments(
      @ApiParam(name = "itemId", value = "商品id", required = true) @RequestParam String itemId,
      @ApiParam(name = "level", value = "评价等级", required = false) @RequestParam(required = false)
          Integer level,
      @ApiParam(name = "page", value = "查询下一页的第几页", required = false) @RequestParam Integer page,
      @ApiParam(name = "pageSize", value = "分页的每一页显示的条数", required = false) @RequestParam
          Integer pageSize) {

    if (StringUtils.isBlank(itemId)) {
      return JSONResult.errorMsg(null);
    }

    if (page == null) {
      page = 1;
    }

    if (pageSize == null) {
      pageSize = COMMON_PAGE_SIZE;
    }

    PagedGridResult grid = itemService.queryPagedComments(itemId, level, page, pageSize);

    return JSONResult.ok(grid);
  }

  @ApiOperation(value = "搜索商品列表", notes = "搜索商品列表", httpMethod = "GET")
  @GetMapping("/search")
  public JSONResult search(
      @ApiParam(name = "keywords", value = "关键字", required = true)
      @RequestParam String keywords,
      @ApiParam(name = "sort", value = "排序", required = false)
      @RequestParam String sort,
      @ApiParam(name = "page", value = "查询下一页的第几页", required = false)
      @RequestParam Integer page,
      @ApiParam(name = "pageSize", value = "分页的每一页显示的条数", required = false)
      @RequestParam  Integer pageSize) {

    if (StringUtils.isBlank(keywords)) {
      return JSONResult.errorMsg(null);
    }

    if (page == null) {
      page = 1;
    }

    if (pageSize == null) {
      pageSize = PAGE_SIZE;
    }

    PagedGridResult grid = itemService.searchItems(keywords, sort, page, pageSize);

    return JSONResult.ok(grid);
  }

  @ApiOperation(value = "通过分类id搜索商品列表", notes = "通过分类id搜索商品列表", httpMethod = "GET")
  @GetMapping("/catItems")
  public JSONResult catItems(
      @ApiParam(name = "catId", value = "三级分类id", required = true)
      @RequestParam Integer catId,
      @ApiParam(name = "sort", value = "排序", required = false)
      @RequestParam String sort,
      @ApiParam(name = "page", value = "查询下一页的第几页", required = false)
      @RequestParam Integer page,
      @ApiParam(name = "pageSize", value = "分页的每一页显示的条数", required = false)
      @RequestParam Integer pageSize) {

    if (catId == null) {
      return JSONResult.errorMsg(null);
    }

    if (page == null) {
      page = 1;
    }

    if (pageSize == null) {
      pageSize = PAGE_SIZE;
    }

    PagedGridResult grid = itemService.searchItems(catId, sort, page, pageSize);

    return JSONResult.ok(grid);
  }

  // 用于用户长时间未登录网站，刷新购物车中的数据（主要是商品价格），类似京东淘宝
  @ApiOperation(value = "根据商品规格ids查找最新的商品数据", notes = "根据商品规格ids查找最新的商品数据", httpMethod = "GET")
  @GetMapping("/refresh")
  public JSONResult refresh(
      @ApiParam(
              name = "itemSpecIds",
              value = "拼接的规格ids",
              required = true,
              example = "1001,1003,1005")
          @RequestParam
          String itemSpecIds) {

    if (StringUtils.isBlank(itemSpecIds)) {
      return JSONResult.ok();
    }

    List<ShopcartVO> list = itemService.queryItemsBySpecIds(itemSpecIds);

    return JSONResult.ok(list);
  }
}
