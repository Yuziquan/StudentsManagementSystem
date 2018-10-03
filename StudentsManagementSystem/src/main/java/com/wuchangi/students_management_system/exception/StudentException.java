package com.wuchangi.students_management_system.exception;

/*
 * @program: StudentsManagementSystem
 * @description:
 * @author: WuchangI
 * @create: 2018-08-02-17-58
 **/

import com.wuchangi.students_management_system.enums.ResultEnum;

/**
 * 一个自定义的异常类。注意要继承RuntimeException，而非继承Exception，因为Spring只对RuntimeException执行事务回滚。
 */
public class StudentException extends RuntimeException
{
    //状态码
    private Integer code;

    public StudentException(ResultEnum resultEnum)
    {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }

    public Integer getCode()
    {
        return code;
    }

    public void setCode(Integer code)
    {
        this.code = code;
    }
}
