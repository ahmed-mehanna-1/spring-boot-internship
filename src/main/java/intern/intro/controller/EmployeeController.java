package intern.intro.controller;

import intern.intro.model.Employee;
import intern.intro.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("{employee-id}")
    public ResponseEntity getEmployee(@PathVariable("employee-id") Integer employeeId) throws Throwable {
        return new ResponseEntity(employeeService.getEmployeeById(employeeId), HttpStatus.OK);
    }

    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeService.addEmployee(employee);
    }
}
