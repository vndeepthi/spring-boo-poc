package com.poc.sample;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {

    @RequestMapping(value = "/", produces = { MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE })
    public List<Employee> getEmployees()
    {
        List<Employee> employeesList = new ArrayList<>();
        employeesList.add(new Employee(1,"lokesh","gupta","howtodoinjava@gmail.com"));
        return employeesList;
    }
}
