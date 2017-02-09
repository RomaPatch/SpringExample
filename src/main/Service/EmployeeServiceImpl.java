package main.Service;


import main.dao.EmployeeDAO;
import main.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private DateService dateService;

    @Autowired
    private EmployeeDAO employeeDao;


    public void registerEmployee(Employee employee) {
        employee.setAssessmentDate(dateService.getNextAssessmentDate());
        employeeDao.saveInDatabase(employee);
    }

}