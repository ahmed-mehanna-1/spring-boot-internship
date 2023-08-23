package intern.intro.service.impl;

import intern.intro.model.Student;
import intern.intro.model.StudentCourse;
import intern.intro.repository.CourseRepository;
import intern.intro.repository.StudentCourseRepository;
import intern.intro.repository.StudentRepository;
import intern.intro.service.StudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;
    private final StudentCourseRepository studentCourseRepository;
    private final CourseRepository courseRepository;

    public StudentServiceImpl(StudentRepository studentRepository, StudentCourseRepository studentCourseRepository, CourseRepository courseRepository) {

        this.studentRepository = studentRepository;
        this.studentCourseRepository = studentCourseRepository;
        this.courseRepository = courseRepository;
    }

    @Override
    public boolean addCourse(Integer studentId, Integer courseId) {
        if (!studentRepository.existsById(studentId) || !courseRepository.existsById(courseId))
            throw new RuntimeException("IDs are fault");
        StudentCourse studentCourse = new StudentCourse();
        studentCourse.setStudentId(studentId);
        studentCourse.setCourseId(courseId);
        studentCourse.setTerm("Spring");
        studentCourseRepository.save(studentCourse);
        return true;
    }

    @Override
    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteCourse() {

    }

    @Override
    public void registerSection() {

    }
}
