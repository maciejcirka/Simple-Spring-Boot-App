package com.example.employees.dao;

import com.example.employees.model.Employee;
import java.util.List;
import java.util.UUID;

public interface EmployeeDao {

    Employee selectEmployee(UUID id);

    List<Employee> selectAllEmployees();

    String addEmployee(UUID id, Employee newEmployee);

    String updateEmployee(UUID id, Employee updatedEmployee);

    String deleteEmployee(UUID id);

    Boolean exists(UUID id);


}
