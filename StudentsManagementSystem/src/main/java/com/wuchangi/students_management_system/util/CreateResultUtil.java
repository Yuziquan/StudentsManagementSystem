package com.wuchangi.students_management_system.util;

/*
 * @program: StudentsManagementSystem
 * @description:
 * @author: WuchangI
 * @create: 2018-08-02-16-57
 **/

import com.wuchangi.students_management_system.entity.Result;

//一个构造返回结果的工具类（以避免代码重复）
public class CreateResultUtil
{
    //构造一个请求成功的返回结果（含有返回内容）
    public static Result createSuccessResult(Object object)
    {
        Result result = new Result();
        result.setCode(0);
        result.setMsg("成功!");
        result.setData(object);

        return result;
    }

    //构造一个请求成功的返回结果（不含有返回内容）
    public static Result createSuccessResult()
    {
        return createSuccessResult(null);
    }

    //构造一个请求失败的返回结果（含有错误码和错误信息）
    public static Result createErrorResult(Integer code, String msg)
    {
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);

        return result;
    }


}
