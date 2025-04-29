package com.futurestack.workforcepro.employeemanagement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/departments")
public class DepartmentController {

    @GetMapping ("/getname")
        public String getdepartment(){
            return "Aaqeeb";
        }
}
