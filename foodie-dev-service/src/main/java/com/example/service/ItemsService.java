package com.example.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.pojo.Items;
import com.example.pojo.ItemsImg;
import com.example.pojo.ItemsParam;
import com.example.pojo.ItemsSpec;
import com.example.utils.PagedGridResult;
import com.example.vo.CommentLevelCountsVO;
import com.example.vo.ShopcartVO;
import java.util.List;

public interface ItemsService extends IService<Items>{

  /**
   * 根据商品ID查询商品
   * @param itemId
   * @return
   */
  Items queryItemById(String itemId);

  List<ItemsImg> queryItemImgList(String itemId);

  List<ItemsSpec> queryItemSpecList(String itemId);

  ItemsParam queryItemParam(String itemId);

  CommentLevelCountsVO queryCommentCounts(String itemId);

  PagedGridResult searchItems(String keywords, String sort, Integer page, Integer pageSize);

  PagedGridResult queryPagedComments(String itemId, Integer level, Integer page, Integer pageSize);

  List<ShopcartVO> queryItemsBySpecIds(String itemSpecIds);
}
