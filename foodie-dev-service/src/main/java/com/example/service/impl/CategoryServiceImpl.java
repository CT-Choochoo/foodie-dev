package com.example.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.example.constants.AppConstants.Constants;
import com.example.mapper.CategoryMapper;
import com.example.mapper.CategoryMapperCustom;
import com.example.pojo.Category;
import com.example.service.CategoryService;
import com.example.vo.CategoryVO;
import com.example.vo.NewItemsVO;
import java.util.HashMap;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category>
    implements CategoryService {

  @Autowired CategoryMapper categoryMapper;
  @Autowired
  CategoryMapperCustom categoryMapperCustom;
  @Override
  public List<Category> queryAllRootLevelCat() {
    return categoryMapper.selectList(new LambdaQueryWrapper<Category>()
    .eq(Category::getType, Constants.CONS_INT_1));
  }

  @Override
  public List<CategoryVO> getSubCatList(Integer rootCatId) {
    return categoryMapperCustom.getSubCatList(rootCatId);
  }

  @Override
  public List<NewItemsVO> getSixNewItemLazy(Integer rootCatId) {
    HashMap<String, Object> queryMap = new HashMap<>();
    queryMap.put("rootCatId",rootCatId);
    return categoryMapperCustom.getSixNewItemsLazy(queryMap);
  }
}
