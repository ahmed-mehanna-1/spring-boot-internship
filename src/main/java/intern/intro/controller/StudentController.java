package intern.intro.controller;

import intern.intro.model.Course;
import intern.intro.model.Student;
import intern.intro.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentController {
    private final StudentService studentService;


    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("add/student")
    public Student addStudent(@RequestBody Student student) {
        studentService.addStudent(student);
        return student;
    }

    @PostMapping("add/course/{student-id}/{course-id}")
    public String addCourse(@PathVariable("student-id") Integer studentId,
                             @PathVariable("course-id") Integer courseId) {
        studentService.addCourse(studentId, courseId);
        return "Success";
    }

}
