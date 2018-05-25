package cn.gouliao.navigation.config;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import cn.gouliao.navigation.common.ApiResponse;
import cn.gouliao.navigation.common.BusinessException;
import cn.gouliao.navigation.common.ReturnCode;


/**
 * <p>
 * Controller 异常统一处理增强
 * </p>
 *
 * @author Shawn
 * @since 2018/4/11
 */
@RestControllerAdvice
public class ControllerExceptionAdvice {

    @ExceptionHandler(value = Exception.class)
    public ApiResponse errorHandler(Exception ex) {
        return ApiResponse.failOf(ReturnCode.CODE_FAIL, ex.getMessage());
    }

    @ExceptionHandler(value = BusinessException.class)
    public ApiResponse myErrorHandler(BusinessException ex) {
        return ApiResponse.failOf(ex.getErrCode(), ex.getErrMsg());
    }
}
