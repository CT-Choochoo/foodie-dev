package com.example.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.example.enums.CommentLevel;
import com.example.mapper.ItemsCommentsMapper;
import com.example.mapper.ItemsCommentsMapperCustom;
import com.example.mapper.ItemsImgMapper;
import com.example.mapper.ItemsMapper;
import com.example.mapper.ItemsParamMapper;
import com.example.mapper.ItemsSpecMapper;
import com.example.pojo.Items;
import com.example.pojo.ItemsComments;
import com.example.pojo.ItemsImg;
import com.example.pojo.ItemsParam;
import com.example.pojo.ItemsSpec;
import com.example.service.ItemsService;
import com.example.utils.DesensitizationUtil;
import com.example.utils.PagedGridResult;
import com.example.vo.CommentLevelCountsVO;
import com.example.vo.ItemCommentVO;
import com.example.vo.SearchItemsVO;
import com.example.vo.ShopcartVO;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

@Service
public class ItemsServiceImpl extends ServiceImpl<ItemsMapper, Items> implements ItemsService {

  @Autowired ItemsMapper itemsMapper;
  @Autowired ItemsImgMapper itemsImgMapper;
  @Autowired ItemsSpecMapper itemsSpecMapper;
  @Autowired ItemsParamMapper itemsParamMapper;
  @Autowired ItemsCommentsMapper itemsCommentsMapper;
  @Autowired ItemsCommentsMapperCustom itemsMapperCustom;

  /**
   * @param itemId
   * @return
   */
  @Override
  public Items queryItemById(String itemId) {
    return itemsMapper.selectById(itemId);
  }

  @Override
  public List<ItemsImg> queryItemImgList(String itemId) {

    return itemsImgMapper.selectList(
        new LambdaQueryWrapper<ItemsImg>().eq(ItemsImg::getItemId, itemId));
  }

  @Override
  public List<ItemsSpec> queryItemSpecList(String itemId) {

    return itemsSpecMapper.selectList(
        new LambdaQueryWrapper<ItemsSpec>().eq(ItemsSpec::getItemId, itemId));
  }

  @Override
  public ItemsParam queryItemParam(String itemId) {
    return itemsParamMapper.selectOne(
        new LambdaQueryWrapper<ItemsParam>().eq(ItemsParam::getItemId, itemId));
  }

  @Override
  public CommentLevelCountsVO queryCommentCounts(String itemId) {
    Integer goodC = getCommentCounts(itemId, CommentLevel.GOOD.type);
    Integer normalC = getCommentCounts(itemId, CommentLevel.NORMAL.type);
    Integer badC = getCommentCounts(itemId, CommentLevel.BAD.type);
    return new CommentLevelCountsVO() {
      {
        setBadCounts(badC);
        setNormalCounts(normalC);
        setGoodCounts(goodC);
        setTotalCounts(goodC + normalC + badC);
      }
    };
  }

  private Integer getCommentCounts(String itemId, Integer level) {

    return itemsCommentsMapper.selectCount(
        new LambdaQueryWrapper<ItemsComments>()
            .eq(ItemsComments::getItemId, itemId)
            .eq(Objects.nonNull(level), ItemsComments::getCommentLevel, level));
  }

  @Override
  public PagedGridResult queryPagedComments(
      String itemId, Integer level, Integer page, Integer pageSize) {
    Map<String, Object> map = new HashMap<>();
    map.put("itemId", itemId);
    map.put("level", level);

    // mybatis-pagehelper

    /**
     * page: 第几页
     * pageSize: 每页显示条数
     */
    PageHelper.startPage(page, pageSize);

    List<ItemCommentVO> list = itemsMapperCustom.queryItemComments(map);
    for (ItemCommentVO vo : list) {
      vo.setNickname(DesensitizationUtil.commonDisplay(vo.getNickname()));
    }

    return setterPagedGrid(list, page);
  }

  @Override
  public List<ShopcartVO> queryItemsBySpecIds(String itemSpecIds) {
    return null;
  }

  @Override
  public PagedGridResult searchItems(Integer catId, String sort, Integer page, Integer pageSize) {
    Map<String, Object> map = new HashMap<>();
    map.put("catId", catId);
    map.put("sort", sort);
    PageHelper.startPage(page, pageSize);
    List<SearchItemsVO> list = itemsMapperCustom.searchItemsByThirdCat(map);
    return setterPagedGrid(list, page);
  }

  @Override
  public PagedGridResult searchItems(String keywords, String sort, Integer page, Integer pageSize) {
    Map<String, Object> map = new HashMap<>();
    map.put("keywords", keywords);
    map.put("sort", sort);

    PageHelper.startPage(page, pageSize);
    List<SearchItemsVO> list = itemsMapperCustom.searchItems(map);

    return setterPagedGrid(list, page);
  }

  private PagedGridResult setterPagedGrid(List<?> list, Integer page) {
    PageInfo<?> pageList = new PageInfo<>(list);
    PagedGridResult grid = new PagedGridResult();
    grid.setPage(page);
    grid.setRows(list);
    grid.setTotal(pageList.getPages());
    grid.setRecords(pageList.getTotal());
    return grid;
  }
}
