package intern.intro.service;

import intern.intro.model.Course;
import intern.intro.model.Student;

public interface StudentService {
    boolean addCourse(Integer studentId, Integer courseId);
    Student addStudent(Student student);
    void deleteCourse();
    void registerSection();
}
