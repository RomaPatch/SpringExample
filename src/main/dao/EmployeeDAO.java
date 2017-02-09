package main.dao;


import main.model.Employee;

public interface EmployeeDAO {

    void saveInDatabase(Employee employee);
}