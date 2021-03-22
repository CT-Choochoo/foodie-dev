package com.example.controller;

import com.example.enums.YesOrNo;
import com.example.pojo.Carousel;
import com.example.service.CarouselService;
import com.example.service.CategoryService;
import com.example.utils.JSONResult;
import com.example.vo.CategoryVO;
import com.example.vo.NewItemsVO;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import java.util.List;
import javax.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/index")
public class IndexController {


  @Autowired CarouselService carouselService;
  @Autowired CategoryService categoryService;

  @GetMapping("/carousel")
  @ApiOperation(value = "获取首页轮播图", notes = "轮播图列表接口", httpMethod = "GET")
  public JSONResult carousel() {
    List<Carousel> list = carouselService.queryAll(YesOrNo.YES.type);
    return JSONResult.ok(list);
  }

  @GetMapping("/cats")
  @ApiOperation(value = "获取主分类接口", notes = "主分类接口", httpMethod = "GET")
  public JSONResult cats(){
    return JSONResult.ok(categoryService.queryAllRootLevelCat());
  }
  @ApiOperation(value = "获取子分类接口", notes = "子分类接口", httpMethod = "GET")
  @GetMapping("/subCat/{rootCatId}")
  public JSONResult subCat(
      @ApiParam(name = "rootCatId",value = "一级分类ID",required = true)
      @PathVariable @NotNull Integer rootCatId){

    List<CategoryVO> list = categoryService.getSubCatList(rootCatId);
    return JSONResult.ok(list);
  }
  @ApiOperation(value = "查询每个一级分类下的商品信息", notes = "查询每个一级分类下的商品信息", httpMethod = "GET")
  @GetMapping("/sixNewItems/{rootCatId}")
  public JSONResult sixNewItems(
      @ApiParam(name = "rootCatId",value = "一级分类ID",required = true)
      @PathVariable @NotNull Integer rootCatId){

    List<NewItemsVO> list = categoryService.getSixNewItemLazy(rootCatId);
    return JSONResult.ok(list);
  }
}
