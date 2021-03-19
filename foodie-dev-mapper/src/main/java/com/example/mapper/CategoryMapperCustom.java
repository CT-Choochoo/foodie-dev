package com.example.mapper;

import com.example.vo.CategoryVO;
import com.example.vo.NewItemsVO;
import java.util.List;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

public interface CategoryMapperCustom{

    List<CategoryVO> getSubCatList(Integer rootCatId);

    List<NewItemsVO> getSixNewItemsLazy(@Param("paramsMap") Map<String, Object> map);
}
