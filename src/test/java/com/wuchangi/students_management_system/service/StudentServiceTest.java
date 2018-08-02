package com.wuchangi.students_management_system.service;

import com.wuchangi.students_management_system.entity.Student;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentServiceTest
{
    @Autowired
    private StudentService studentService;

    @Test
    public void findStudentById()
    {
        Student student = studentService.findStudentById("20162142523");
        Assert.assertEquals(12, student.getAge());
    }
}

