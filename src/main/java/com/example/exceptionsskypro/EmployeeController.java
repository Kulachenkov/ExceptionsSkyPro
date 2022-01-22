package com.example.exceptionsskypro;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    @GetMapping
    public String greetEmployee(){
        return "Welcome to the project!";
    }
    @GetMapping("/add")
    public Employee addEmployee(@RequestParam("firstName") String firstName,
                              @RequestParam("lastName") String lastName){
        Employee addedEmployee = employeeService.addEmployee(firstName,lastName);
        return addedEmployee;
    }
    @GetMapping("/remove")
    public Employee removeEmployee(@RequestParam("firstName") String firstName,
                              @RequestParam("lastName") String lastName){
        Employee removeEmployee = employeeService.removeEmployee(firstName,lastName);
        return removeEmployee;
    }
    @GetMapping("/find")
    public Employee findEmployee(@RequestParam("firstName") String firstName,
                              @RequestParam("lastName") String lastName){
        Employee foundEmployee = employeeService.findEmployee(firstName,lastName);
        return foundEmployee;
    }

}
