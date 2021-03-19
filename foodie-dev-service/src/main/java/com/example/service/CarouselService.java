package com.example.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.pojo.Carousel;
import java.util.List;

public interface CarouselService extends IService<Carousel>{

  /**
   * 查询所有轮播图
   *
   * @param type
   * @return
   */
  List<Carousel> queryAll(Integer type);
}
