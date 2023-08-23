package intern.intro.service;

import intern.intro.model.Course;
import intern.intro.model.Student;

public interface CourseService {
    Course addCourse(Course course);
    boolean deleteCourse(Integer id);
}
