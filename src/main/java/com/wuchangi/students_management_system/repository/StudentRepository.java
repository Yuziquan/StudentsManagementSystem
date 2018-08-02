package com.wuchangi.students_management_system.repository;

/*
 * @program: StudentsManagementSystem
 * @description:
 * @author: WuchangI
 * @create: 2018-08-01-22-20
 **/

import com.wuchangi.students_management_system.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

/**
 * 定义学生信息数据访问接口
 */
public interface StudentRepository extends JpaRepository<Student, String>
{
    public List<Student> findByAge(Integer age);
    public List<Student> findByName(String name);
    public List<Student> findBySex(String sex);
}
