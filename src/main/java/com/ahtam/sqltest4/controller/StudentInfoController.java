package com.ahtam.sqltest4.controller;

import com.ahtam.sqltest4.entity.StudentInfoBean;
import com.ahtam.sqltest4.service.StudentInfoService;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("student")
public class StudentInfoController {
    @Autowired
    private StudentInfoService studentInfoService;


    @RequestMapping("findAll")
    public List<StudentInfoBean> findAll()
    {

        return studentInfoService.findAll();

    }

    @RequestMapping("findBystuNum")
    @ResponseBody
    public List<StudentInfoBean> findBystuNum(HttpServletRequest request)
    {
        String stuNum_param=request.getParameter("stuNum");         //获取前端参数
        Integer stuNum = Integer.valueOf(stuNum_param);                   //强制类型转换
        return studentInfoService.findBystuNum(stuNum);
    }

    @RequestMapping("findBystuName")
    @ResponseBody
    public List<StudentInfoBean> findBystuName(HttpServletRequest request)
    {
        return studentInfoService.findBystuName(request.getParameter("stuName"));
    }

    @RequestMapping("findBystuAge")
    @ResponseBody
    public List<StudentInfoBean> findBystuAge(HttpServletRequest request)
    {
        String stuAge_param=request.getParameter("stuAge");         //获取前端参数
        Integer stuAge = Integer.valueOf(stuAge_param);                   //强制类型转换
        return studentInfoService.findBystuAge(stuAge);
    }

    @RequestMapping("AddStudent")
    @ResponseBody
    public void AddStudent(HttpServletRequest request)
    {
        String stuNum = request.getParameter("stuNum");
        String stuName = request.getParameter("stuName");
        String stuAge = request.getParameter("stuAge");
        studentInfoService.AddStudent(stuNum,stuName,stuAge);
    }

    @RequestMapping("DeleteInfo")
    @ResponseBody
    public void DeleteInfo(HttpServletRequest request)
    {
        String stuNum = request.getParameter("stuNum");
        studentInfoService.DeleteInfo(stuNum);
    }

    @RequestMapping("ModifyInfo")
    @ResponseBody
    public void ModifyInfo(HttpServletRequest request)
    {
        String stuNum_old=request.getParameter("stuNum_old");
        String stuNum=request.getParameter("stuNum");
        String stuName=request.getParameter("stuName");
        String stuAge=request.getParameter("stuAge");
        System.out.println(stuNum_old+"+"+stuNum+"+"+stuName+"+"+stuAge);
        studentInfoService.ModifyInfo(stuNum_old,stuNum,stuName,stuAge);
    }
}
