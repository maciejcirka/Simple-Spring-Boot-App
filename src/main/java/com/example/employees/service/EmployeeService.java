package com.example.employees.service;

import com.example.employees.dao.EmployeeDao;
import com.example.employees.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class EmployeeService {

    private EmployeeDao employeeDao;

    @Autowired
    public EmployeeService(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    public Employee selectEmployee(UUID id) {
        return employeeDao.selectEmployee(id);
    }

    public List<Employee> selectAllEmployees() {
        return employeeDao.selectAllEmployees();
    }

    public String addEmployee(Employee newEmployee) {
        UUID id = UUID.randomUUID();
        newEmployee.setId(id);
        return employeeDao.addEmployee(id, newEmployee) +
        "Employee "+ newEmployee + " was successfully added";
    }

    public String updateEmployee(UUID id, Employee updatedEmployee) {
        if (employeeDao.exists(id)) {
            return employeeDao.updateEmployee(id, updatedEmployee) +
                   "Employee " + updatedEmployee + " was successfully updated";
        } else {
            return "Did not find a record";
        }
    }

    public String deleteEmployee(UUID id) {
        Employee e = employeeDao.selectEmployee(id);
        if (employeeDao.exists(id)) {
            return employeeDao.deleteEmployee(id) +
             "Employee " + e + " was successfully removed";

        } else {
            return "Did not find a record";

        }
    }
}





