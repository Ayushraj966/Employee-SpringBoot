package com.example.employee.employee;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;

@RestController
public interface EmployeeService {
    String createEmployee(Employee employee);
    List<Employee> readEmployees();
    Employee readEmployee(Long id);
    boolean deleteEmployee(Long id);
    String updateEmployee(Long id, Employee employee);
}
    