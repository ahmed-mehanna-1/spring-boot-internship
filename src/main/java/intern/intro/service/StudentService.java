package intern.intro.service;

import intern.intro.model.Course;
import intern.intro.model.Student;

public interface StudentService {
    Student addCourse(Integer studentId, Course course);
    Student addStudent(Student student);
    void deleteCourse();
    void registerSection();
}
