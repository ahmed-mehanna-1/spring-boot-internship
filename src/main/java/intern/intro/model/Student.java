package intern.intro.model;

import lombok.*;

import java.util.ArrayList;

@Getter
@Setter
@ToString
public class Student {
    private String name;
    private int age;
    private float gpa;
    private ArrayList<Course> courses;

    public Student(String name, int age, float gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.courses = new ArrayList<>();
    }

    public void addCourse(Course c) {
        this.courses.add(c);
    }
}

