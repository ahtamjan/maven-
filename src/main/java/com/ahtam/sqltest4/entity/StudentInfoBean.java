package com.ahtam.sqltest4.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity                              //声明一个实体，用的是Java规范下的注解
@Table(name = "T_STUDENT")          //映射的表名称
public class StudentInfoBean {
    @Id                                  //声明主键
    private Integer stuNum;

    @Column(length = 20)
    private String stuName;              //姓名
    @Column(length = 2)
    private Integer stuAge;        //年龄


    public Integer getStuNum() {

        return stuNum;
    }

    public void setStuNum(Integer stuNum) {

        this.stuNum = stuNum;
    }

    public String getStuName() {

        return stuName;
    }

    public void setStuName(String stuName) {

        this.stuName = stuName;
    }

    public Integer getStuAge() {
        return stuAge;
    }

    public void setStuAge(Integer stuAge) {
        this.stuAge = stuAge;
    }
}