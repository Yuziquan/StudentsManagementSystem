package com.wuchangi.students_management_system.service;

/*
 * @program: StudentsManagementSystem
 * @description:
 * @author: WuchangI
 * @create: 2018-08-01-22-29
 **/

import com.wuchangi.students_management_system.entity.Student;
import com.wuchangi.students_management_system.enums.ResultEnum;
import com.wuchangi.students_management_system.exception.StudentException;
import com.wuchangi.students_management_system.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 一个处理业务逻辑的服务类
 */
@Service
public class StudentService
{
    @Autowired
    private StudentRepository studentRepository;

    /**
     * 获取所有学生信息的一个列表
     */
    public List<Student> getStudentList()
    {
        return studentRepository.findAll();
    }

    /**
     * 新增一个学生的信息
     * @param number
     * @param name
     * @param sex
     * @param age
     * @return
     */
    public Student addStudent(String number, String name, String sex, Integer age)
    {
        Student student = new Student();
        student.setNumber(number);
        student.setName(name);
        student.setSex(sex);
        student.setAge(age);

        return studentRepository.save(student);
    }

    /**
     * 通过学号查询一个学生的信息
     * @param number
     * @return
     */
    public Student findStudentById(String number)
    {
        return studentRepository.findById(number).orElse(null);
    }

    /**
     * 通过姓名查询多个学生的信息
     * @param name
     * @return
     */
    public List<Student> findStudentByName(String name)
    {
        return studentRepository.findByName(name);
    }


    /**
     * 通过性别查询多个学生的信息
     * @param sex
     * @return
     */
    public List<Student> findStudentBySex(String sex)
    {
        return studentRepository.findBySex(sex);
    }

    /**
     * 通过年龄查询多个学生的信息
     * @param age
     * @return
     */
    public List<Student> findStudentByAge(Integer age)
    {
        return studentRepository.findByAge(age);
    }


    /**
     * 通过学号更新一个学生的信息
     * @param number
     * @param name
     * @param sex
     * @param age
     * @return
     */
    public Student updateStudent(String number, String name, String sex, Integer age)
    {
        Student student = new Student();
        student.setNumber(number);
        student.setName(name);
        student.setSex(sex);
        student.setAge(age);

        return studentRepository.save(student);
    }

    /**
     * 通过学号删除一个学生的信息
     * @param number
     */
    public void deleteStudent(String number)
    {
        studentRepository.deleteById(number);
    }


    /**
     * 插入两个学生的信息
     */
    @Transactional
    public void insertTwoStudents()
    {
        Student student1 = new Student();
        student1.setNumber("20162180122");
        student1.setName("邓光明");
        student1.setSex("男");
        student1.setAge(21);
        studentRepository.save(student1);

        Student student2 = new Student();
        student2.setNumber("20162180111");
        student2.setName("郭小萍");
        student2.setSex("女");
        student2.setAge(20);
        studentRepository.save(student2);
    }

    /**
     * 通过学号获取该学生的信息，并通过其年龄判断其具体身份
     * @param number
     * @throws Exception
     */
    public void getAge(String number) throws Exception
    {
        Student student =studentRepository.findById(number).orElse(null);
        Integer age = student.getAge();

        if(age <= 20)
        {
            //返回"可能还在上高中" code=100
            throw new StudentException(ResultEnum.HIGH_SCHOOL);
        }
        else if(age > 20 && age < 24)
        {
            //返回"可能还在上大学" code=101
            throw new StudentException(ResultEnum.COLLEGE);
        }
    }

}
