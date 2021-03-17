package com.example.exception;

/**
 *  自定义异常
 * @author yxp
 */
public class BusinessException extends RuntimeException {
  private Integer code;

  public BusinessException(String errorMsg) {
    super(errorMsg);
  }

  public BusinessException(Integer code, String message) {
    super(message);
    this.code = code;
  }

  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }
}
