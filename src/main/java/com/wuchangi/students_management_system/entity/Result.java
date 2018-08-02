package com.wuchangi.students_management_system.entity;

/*
 * @program: StudentsManagementSystem
 * @description: http请求返回的最外层对象
 * @author: WuchangI
 * @create: 2018-08-02-16-46
 **/

/**
 * 服务器返回的结果格式
 */
public class Result<T>
{
    //状态码
    private Integer code;

    //提示信息
    private String msg;

    //返回的具体内容
    private T data;

    public Integer getCode()
    {
        return code;
    }

    public void setCode(Integer code)
    {
        this.code = code;
    }

    public String getMsg()
    {
        return msg;
    }

    public void setMsg(String msg)
    {
        this.msg = msg;
    }

    public T getData()
    {
        return data;
    }

    public void setData(T data)
    {
        this.data = data;
    }
}
