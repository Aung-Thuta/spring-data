package com.solt;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.solt.service.EmployeeDao;

public class Main  {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        context.registerShutdownHook();

        EmployeeDao employeeDao=context.getBean(EmployeeDao.class);
        employeeDao.listEmail().forEach(System.out::println);
        }
    }

