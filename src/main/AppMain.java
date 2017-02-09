package main;

import main.Service.EmployeeService;
import main.Service.EmployeeServiceImpl;
import main.configuration.AppConfig;
import main.model.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class AppMain {

    public static void main(String args[]){
        AbstractApplicationContext  context = new AnnotationConfigApplicationContext(AppConfig.class);

        EmployeeService service = (EmployeeService) context.getBean(EmployeeServiceImpl.class);

        Employee employee = new Employee();
        employee.setName("Roman Pons");
        service.registerEmployee(employee);

        context.close();
    }
}