package com.example.controller;

import com.example.service.CategoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class CategoryController {

  @Autowired CategoryService categoryService;
  private final Logger logger = LoggerFactory.getLogger(CategoryController.class);
}
