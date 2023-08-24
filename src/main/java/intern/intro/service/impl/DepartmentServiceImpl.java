package intern.intro.service.impl;

import intern.intro.model.Department;
import intern.intro.repository.DepartmentRepository;
import intern.intro.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentRepository repository;

    @Override
    public Department addDepartment(Department department) {
        return repository.save(department);
    }

    @Override
    public Department getDepartmentById(Integer departmentId) {
        return repository.findById(departmentId).orElseThrow();
    }
}
