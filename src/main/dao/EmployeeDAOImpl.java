package main.dao;

import main.model.Employee;
import org.springframework.stereotype.Repository;


@Repository("employeeDao")
public class EmployeeDAOImpl implements EmployeeDAO{

    public void saveInDatabase(Employee employee) {

        /*
         * Logic to save in DB goes here
         */
        System.out.println("Employee "+employee.getName()+" is registered for assessment on "+ employee.getAssessmentDate());

    }

}