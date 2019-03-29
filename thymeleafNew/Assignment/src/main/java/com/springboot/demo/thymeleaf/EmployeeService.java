package com.springboot.demo.thymeleaf;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeService {

    public List<Employee> getEmployeeList() {

        return Arrays.asList(

                new Employee("Aditya", "aditya@gmail.com", 24, true),
                new Employee("amar", "amar@gmail.com", 25, false),
                new Employee("Rahul", "rahul@gmail.com", 23, true),
                new Employee("Raj", "raj@gmail.com", 22, false));
    }

    public Employee getEmployee() {
        return new Employee("adi", "aditya.k1@tothenew.com", 24, true);
    }
}