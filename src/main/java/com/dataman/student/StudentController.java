package com.dataman.student;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: StudentController
 * @Description: 学生数据
 * @date 2017/12/19
 * @Copyright © 2017北京数人科技有限公司
 */
@Controller
public class StudentController {

    @RequestMapping(value = "/v1/students")
    public String getStudents(Model model){
        ArrayList<Student> students = new ArrayList<>();
        Student xm = new Student();
        xm.setId(1);
        xm.setName("小明");
        xm.setAge(20);
        xm.setSex("男");
        xm.setScore(90);

        Student zs = new Student();
        zs.setId(2);
        zs.setName("张三");
        zs.setAge(23);
        zs.setSex("男");
        zs.setScore(92);

        Student ls = new Student();
        ls.setId(3);
        ls.setName("李四");
        ls.setAge(22);
        ls.setSex("男");
        ls.setScore(88);

        students.add(xm);
        students.add(zs);
        students.add(ls);
        model.addAttribute("students",students);
        return "student";
    }
}
