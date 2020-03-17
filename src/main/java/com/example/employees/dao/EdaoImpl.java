package com.example.employees.dao;

import com.example.employees.model.Employee;
import org.springframework.stereotype.Repository;
import java.util.*;


@Repository("Edao")
public class EdaoImpl implements EmployeeDao{

    private Map<UUID, Employee> database;

    public EdaoImpl() {
        database = new HashMap<>();
        UUID id = UUID.randomUUID();
        database.put(id, new Employee(id,"Maciej", "Cirka", 24, "CEO" ));
    }

    @Override
    public Employee selectEmployee(UUID id) {
        return database.get(id);
    }

    @Override
    public List<Employee> selectAllEmployees() {
        return new ArrayList<>(database.values());
    }

    @Override
    public String addEmployee(UUID id, Employee newEmployee) {
        database.put(id, newEmployee);
        return "";
    }

    @Override
    public String updateEmployee(UUID id, Employee updatedEmployee) {
        database.put(id, updatedEmployee);
        return "";
    }

    @Override
    public String deleteEmployee(UUID id) {

        database.remove(id);
        return "";
    }

    @Override
    public Boolean exists(UUID id) {
        return database.containsKey(id);
    }

}
