package com.example.mapper;

import com.example.vo.ItemCommentVO;
import com.example.vo.MyCommentVO;
import com.example.vo.SearchItemsVO;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/** 自定义评论mapper */
@Mapper
public interface ItemsCommentsMapperCustom {

  void saveComments(Map<String, Object> map);

  List<MyCommentVO> queryMyComments(@Param("paramsMap") Map<String, Object> map);

  List<SearchItemsVO> searchItemsByThirdCat(@Param("paramsMap") Map<String, Object> map);

  List<SearchItemsVO> searchItems(@Param("paramsMap") Map<String, Object> map);

  List<ItemCommentVO> queryItemComments(@Param("paramsMap") Map<String, Object> map);
}
