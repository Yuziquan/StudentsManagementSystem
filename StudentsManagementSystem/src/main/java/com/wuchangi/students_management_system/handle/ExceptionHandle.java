package com.wuchangi.students_management_system.handle;

import com.wuchangi.students_management_system.entity.Result;
import com.wuchangi.students_management_system.exception.StudentException;
import com.wuchangi.students_management_system.util.CreateResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/*
 * @program: StudentsManagementSystem
 * @description:
 * @author: WuchangI
 * @create: 2018-08-02-17-24
 **/

/**
 * 一个处理全局异常的异常处理类（将异常捕获，然后构造一个结果并返回给客户端）
 */
@ControllerAdvice
public class ExceptionHandle
{
    private static final Logger logger = LoggerFactory.getLogger(ExceptionHandle.class);

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handle(Exception e)
    {
        if(e instanceof StudentException)
        {
            StudentException studentException = (StudentException)e;
            return CreateResultUtil.createErrorResult(studentException.getCode(), studentException.getMessage());
        }
        else
        {
            logger.error("[系统异常]{}", e);
            return CreateResultUtil.createErrorResult(-1, "未知错误");
        }

    }

}
