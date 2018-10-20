## StudentsManagementSystem
[![StudentsManagementSystem](https://img.shields.io/badge/StudentsManagementSystem-v1.0.0-brightgreen.svg)](https://github.com/Yuziquan/StudentsManagementSystem)
[![license](https://img.shields.io/packagist/l/doctrine/orm.svg)](
https://github.com/Yuziquan/StudentsManagementSystem/blob/master/LICENSE)

### 一、Demo功能

>  通过Spring Boot搭建“实现对学生信息CRUD操作”的简单Web应用程序。其中学生信息包括：学号、姓名、性别、年龄，也实现了利用AOP处理请求、全局统一异常处理、单元测试等。

<br/>

***
### 二、该Demo的项目结构

![1](https://github.com/Yuziquan/StudentsManagementSystem/blob/master/Screenshots/project_structure.png)

<br/>

***

### 三、该Demo的RESTful API

| 请求类型   | 请求URL        | 功能            |
| ------ | ------------ | ------------- |
| GET    | /students    | 获取所有学生信息的一个列表 |
| POST   | /create      | 新增一个学生的信息     |
| GET    | /student/num | 通过学号查询一个学生的信息 |
| PUT    | /student/num | 通过学号更新一个学生的信息 |
| DELETE | /student/num | 通过学号删除一个学生的信息 |

