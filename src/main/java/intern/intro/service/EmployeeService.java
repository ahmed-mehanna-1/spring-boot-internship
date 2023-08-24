package intern.intro.service;

import intern.intro.model.Employee;

public interface EmployeeService {
    Employee addEmployee(Employee employee);
    Employee getEmployeeById(Integer employeeId) throws Throwable;
}
