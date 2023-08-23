package intern.intro.service.impl;

import intern.intro.model.Course;
import intern.intro.repository.CourseRepository;
import intern.intro.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseRepository repository;

    @Override
    public Course addCourse(Course course) {
        return repository.save(course);
    }

    @Override
    public boolean deleteCourse(Integer id) {
        return false;
    }
}
