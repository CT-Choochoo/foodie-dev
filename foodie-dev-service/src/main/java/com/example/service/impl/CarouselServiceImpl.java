package com.example.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.example.mapper.CarouselMapper;
import com.example.pojo.Carousel;
import com.example.service.CarouselService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

@Service
public class CarouselServiceImpl extends ServiceImpl<CarouselMapper, Carousel>
    implements CarouselService {

  @Autowired CarouselMapper carouselMapper;

  @Override
  public List<Carousel> queryAll(Integer type) {
    return carouselMapper.selectList(
        new LambdaQueryWrapper<Carousel>()
            .eq(Carousel::getIsShow, type)
            .orderByDesc(Carousel::getSort));
  }
}
