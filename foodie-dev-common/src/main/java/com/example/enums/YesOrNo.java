package com.example.enums;

public enum YesOrNo {
  YES(1, "女"),
  NO(0, "男");

  public final Integer type;
  public final String value;

  YesOrNo(Integer type, String value) {
    this.type = type;
    this.value = value;
  }
}
