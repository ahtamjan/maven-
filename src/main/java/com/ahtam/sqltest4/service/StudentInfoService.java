package com.ahtam.sqltest4.service;

import com.ahtam.sqltest4.dao.StudentInfoRepository;
import com.ahtam.sqltest4.entity.StudentInfoBean;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentInfoService {

    @Autowired
    private StudentInfoRepository studentInfoRepository;

    public List<StudentInfoBean> findAll()
    {
        return studentInfoRepository.findAll();
    }

    public List<StudentInfoBean> findBystuNum(Integer stuNum)
    {
        return studentInfoRepository.getByStuNumIs(stuNum);
    }

    public List<StudentInfoBean> findBystuName(String stuName)
    {
        return studentInfoRepository.getByStuNameIs(stuName);
    }

    public List<StudentInfoBean> findBystuAge(Integer stuAge)
    {
        return studentInfoRepository.getByStuAgeIs(stuAge);
    }


    public void AddStudent(String stuNum,String stuName, String stuAge){

        Integer stuNum_param = Integer.valueOf(stuNum);
        Integer stuAge_param = Integer.valueOf(stuAge);

        StudentInfoBean stu = new StudentInfoBean();
        stu.setStuNum(stuNum_param);
        stu.setStuName(stuName);
        stu.setStuAge(stuAge_param);

        studentInfoRepository.save(stu);

    }
    @Transactional
    public void DeleteInfo(String stuNum)
    {
        Integer stuNum_param = Integer.valueOf(stuNum);
        studentInfoRepository.deleteByStuNumIs(stuNum_param);
    }

    @Transactional
    public void ModifyInfo(String stuNum_old,String stuNum,String stuName,String stuAge)
    {
        Integer stuNum_old_param = Integer.valueOf(stuNum_old);
        Integer stuNum_param = Integer.valueOf(stuNum);
        Integer stuAge_param = Integer.valueOf(stuAge);
        studentInfoRepository.deleteByStuNumIs(stuNum_old_param);
        StudentInfoBean stu_mod = new StudentInfoBean();
        stu_mod.setStuNum(stuNum_param);
        stu_mod.setStuName(stuName);
        stu_mod.setStuAge(stuAge_param);
        studentInfoRepository.save(stu_mod);

    }
}
