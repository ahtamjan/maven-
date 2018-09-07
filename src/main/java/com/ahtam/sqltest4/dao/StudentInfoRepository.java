package com.ahtam.sqltest4.dao;

import com.ahtam.sqltest4.entity.StudentInfoBean;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

//使用repository要注明实体雷明和主键类型

public interface StudentInfoRepository extends JpaRepository<StudentInfoBean,Integer>
{
    List<StudentInfoBean> getByStuNumIs(Integer stuNum);
    List<StudentInfoBean> getByStuNameIs(String stuName);
    List<StudentInfoBean> getByStuAgeIs(Integer stuAge);
    List<StudentInfoBean> deleteByStuNumIs(Integer stuNum);
}
