package com.wuchangi.students_management_system.controller;

/*
 * @program: StudentsManagementSystem
 * @description:
 * @author: WuchangI
 * @create: 2018-08-01-22-17
 **/

import com.wuchangi.students_management_system.entity.Student;
import com.wuchangi.students_management_system.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController
{
    @Autowired
    private StudentService studentService;

    /**
     * 获取所有学生信息的一个列表
     */
    @GetMapping(value = "/students")
    public List<Student> getStudentList()
    {
        return studentService.getStudentList();
    }

    /**
     * 新增一个学生的信息
     * @param number
     * @param name
     * @param sex
     * @param age
     * @return
     */
    @PostMapping(value = "/create")
    public Student addStudent(@RequestParam("number") String number,
                              @RequestParam("name") String name,
                              @RequestParam("sex") String sex,
                              @RequestParam("age") Integer age)
    {
        return studentService.addStudent(number, name, sex, age);
    }

    /**
     * 通过学号查询一个学生的信息
     * @param number
     * @return
     */
    @GetMapping(value = "/student/{num}")
    public Student findStudentById(@PathVariable("num") String number)
    {
        return studentService.findStudentById(number);
    }

    /**
     * 通过学号更新一个学生的信息
     * @param number
     * @param name
     * @param sex
     * @param age
     * @return
     */
    @PutMapping(value = "/student/{num}")
    public Student updateStudent(@PathVariable("num") String number,
                                 @RequestParam("name") String name,
                                 @RequestParam("sex") String sex,
                                 @RequestParam("age") Integer age)
    {
        return studentService.updateStudent(number, name, sex, age);
    }

    /**
     * 通过学号删除一个学生的信息
     * @param number
     */
    @DeleteMapping(value = "/student/{num}")
    public void deleteStudent(@PathVariable("num") String number)
    {
        studentService.deleteStudent(number);
    }

}
