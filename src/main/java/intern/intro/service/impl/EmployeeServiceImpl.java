package intern.intro.service.impl;

import intern.intro.model.Department;
import intern.intro.model.Employee;
import intern.intro.repository.DepartmentRepository;
import intern.intro.repository.EmployeeRepository;
import intern.intro.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.function.Supplier;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Employee addEmployee(Employee employee) {
        Department department = departmentRepository.findById(employee.getDepartmentId()).orElseThrow();
        employee.setDepartment(department);
        return employeeRepository.save(employee);
    }

    @Override
    public Employee getEmployeeById(Integer employeeId) {
        return employeeRepository.findById(employeeId).orElseThrow(() -> new RuntimeException("Wrong Employee ID"));
    }
}
