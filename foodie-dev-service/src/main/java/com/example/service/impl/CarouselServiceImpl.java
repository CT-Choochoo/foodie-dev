package com.example.service.impl;

import com.example.mapper.CarouselMapper;
import com.example.pojo.Carousel;
import com.example.service.CarouselService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

@Service
public class CarouselServiceImpl extends ServiceImpl<CarouselMapper, Carousel> implements
    CarouselService {

}
