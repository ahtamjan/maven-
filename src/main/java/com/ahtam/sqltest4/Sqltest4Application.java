package com.ahtam.sqltest4;

import com.ahtam.sqltest4.entity.StudentInfoBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;

import javax.persistence.*;


@ControllerAdvice
@SpringBootApplication
public class Sqltest4Application {


    public static void main(String[] args) {

        SpringApplication.run(Sqltest4Application.class, args);
    }
}
