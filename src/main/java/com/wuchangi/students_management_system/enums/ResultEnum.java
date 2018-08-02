package com.wuchangi.students_management_system.enums;

/**
 * 一个存放返回结果中的常量的枚举类
 */
public enum ResultEnum
{
    UNKNOWN_ERROR(-1, "未知错误"),
    SUCCESS(0, "成功"),
    HIGH_SCHOOL(100, "可能还在上高中"),
    COLLEGE(101, "可能还在上大学");


    private Integer code;
    private String msg;

    ResultEnum(Integer code, String msg)
    {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode()
    {
        return code;
    }

    public String getMsg()
    {
        return msg;
    }
}
