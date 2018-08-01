package com.wuchangi.students_management_system.entity;

/*
 * @program: StudentsManagementSystem
 * @description:
 * @author: WuchangI
 * @create: 2018-08-01-21-42
 **/

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student
{
    @Id
    private String number;  //学号
    private String name;
    private String sex;
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
}
