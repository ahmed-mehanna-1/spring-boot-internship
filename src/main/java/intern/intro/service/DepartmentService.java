package intern.intro.service;

import intern.intro.model.Department;

public interface DepartmentService {
    Department addDepartment(Department department);
    Department getDepartmentById(Integer departmentId);
}
