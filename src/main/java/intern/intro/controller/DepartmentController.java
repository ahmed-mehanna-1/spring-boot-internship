package intern.intro.controller;

import intern.intro.model.Department;
import intern.intro.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/department")
public class DepartmentController {
    @Autowired
    private DepartmentService service;

    @GetMapping("{department-id}")
    public Department getDepartment(@PathVariable("department-id") Integer departmentId) {
        return service.getDepartmentById(departmentId);
    }

    @PostMapping
    public Department addDepartment(@RequestBody Department department) {
        return service.addDepartment(department);
    }
}
