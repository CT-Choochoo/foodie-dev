package com.example.exception;

import com.example.utils.JSONResult;
import java.util.List;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 全局异常处理
 * @author yxp
 */
@ControllerAdvice
public class GlobalExceptionHandler {

  protected Logger logger = LoggerFactory.getLogger(getClass());

  /**
   * 数据校验异常
   */
  @ExceptionHandler({BindException.class})
  @ResponseBody
  public JSONResult objectParamExceptionHandle(BindException e) {
    logger.error(e.getMessage(), e);
    BindingResult result = e.getBindingResult();
    if (result.hasErrors()) {
      List<ObjectError> errors = result.getAllErrors();
      ObjectError objectError = errors.stream().findFirst().get();
      return JSONResult.errorMsg(objectError.getDefaultMessage());
    }
    return JSONResult.errorMsg(this.getErrorMsg(e));
  }


  @ExceptionHandler({MethodArgumentNotValidException.class})
  @ResponseBody
  public JSONResult paramExceptionHandle(MethodArgumentNotValidException e) {
    BindingResult result = e.getBindingResult();
    FieldError error = result.getFieldError();
    return JSONResult.errorMsg(error.getDefaultMessage());
  }

  /**
   * 业务异常处理
   *
   * @param e
   * @return
   */
  @ExceptionHandler({BusinessException.class})
  @ResponseBody
  public JSONResult businessExceptionHandle(BusinessException e) {
    return JSONResult.errorMsg(ExceptionUtils.getMessage(e));
  }

  /**
   * 全局异常
   */
  @ExceptionHandler(Exception.class)
  @ResponseBody
  public JSONResult defaultExceptionHandler(Exception e) {
    logger.error(e.getMessage(), e);
    return JSONResult.errorMsg(ExceptionUtils.getMessage(e));
  }

  private String getErrorMsg(Exception e) {
    return this.getErrorMsg(e, 0, 20);
  }

  private String getErrorMsg(Exception e, int currentCount, int maxCount) {
    try {
      if (null != e) {
        if (null != e.getMessage()) {
          return e.getMessage();
        }

        if (currentCount < maxCount) {
          return this.getErrorMsg(e, currentCount + 1, maxCount);
        }
      }
    } catch (Exception var5) {
      logger.error(var5.getMessage(), var5);
      return "失败,请稍候再试！";
    }

    logger.error("错误：", e);
    return "失败,请稍候再试！";
  }
}
