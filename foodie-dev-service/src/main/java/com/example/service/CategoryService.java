package com.example.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.pojo.Category;
import com.example.vo.CategoryVO;
import com.example.vo.NewItemsVO;
import java.util.List;

public interface CategoryService extends IService<Category>{

  /**
   * 查询父类分类
   * @return */
  List<Category> queryAllRootLevelCat();

  /**
   * 获取目录子分类
   * @param rootCatId
   * @return
   */
  List<CategoryVO> getSubCatList(Integer rootCatId);
  /**
   * 获取目录子分类
   * @param rootCatId
   * @return
   */
  List<NewItemsVO> getSixNewItemLazy(Integer rootCatId);
}
