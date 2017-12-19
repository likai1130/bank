package com.dataman.student;

/**
 * @ClassName: Student
 * @Description: 实体
 * @date 2017/12/19
 * @Copyright © 2017北京数人科技有限公司
 */
public class Student {

    private int id;

    private String name;

    private String sex;

    private int age;

    private int score;

    public Student() {
    }

    public Student(int id, String name, String sex, int age, int score) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
