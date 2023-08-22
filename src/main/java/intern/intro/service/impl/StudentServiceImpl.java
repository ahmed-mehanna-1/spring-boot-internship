package intern.intro.service.impl;

import intern.intro.model.Course;
import intern.intro.model.Student;
import intern.intro.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    private List<Student> students;

    public StudentServiceImpl() {
        this.students = new ArrayList<>();
    }

    @Override
    public Student addCourse(Integer studentId, Course course) {
        if (studentId >= students.size() || studentId < 0)
            throw new RuntimeException("Invalid student id");
        students.get(studentId).addCourse(course);
        return students.get(studentId);
    }

    @Override
    public Student addStudent(Student student) {
        students.add(student);
        return student;
    }

    @Override
    public void deleteCourse() {

    }

    @Override
    public void registerSection() {

    }
}
