package com.wuchangi.students_management_system.entity;

/*
 * @program: StudentsManagementSystem
 * @description:
 * @author: WuchangI
 * @create: 2018-08-01-21-42
 **/

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

/**
 * 学生信息实体类
 */
@Entity
public class Student
{
    @Id
    private String number;  //学号(作为主键)

    @NotBlank(message = "姓名必填")
    private String name;

    private String sex;

    /**
     * 最少为18岁
     */
    @Min(value = 18, message = "不允许添加未成年的学生信息")
    private Integer age;

    public Student()
    {
    }

    public String getNumber()
    {
        return number;
    }

    public void setNumber(String number)
    {
        this.number = number;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getSex()
    {
        return sex;
    }

    public void setSex(String sex)
    {
        this.sex = sex;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    @Override
    public String toString()
    {
        return "Student{" + "number='" + number + '\'' + ", name='" + name + '\'' + ", sex='" + sex + '\'' + ", age=" + age + '}';
    }
}
