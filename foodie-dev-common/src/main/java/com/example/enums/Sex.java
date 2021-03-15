package com.example.enums;

public enum Sex {
  Woman(0, "女"),
  man(0, "男"),
  secret(0, "保密");

  public final Integer type;
  public final String value;

  Sex(Integer type, String value) {
    this.type = type;
    this.value = value;
  }
}
