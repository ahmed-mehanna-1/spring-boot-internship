package intern.intro.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name = "student_course")
@IdClass(StudentCourse.CompositeKey.class)
@Getter
@Setter
public class StudentCourse {
    @Id
    @Column(name = "student_id")
    private int studentId;

    @Id
    @Column(name = "course_id")
    private int courseId;

    @Id
    @Column(name = "term")
    private String term;

    @Getter
    @Setter
    public static class CompositeKey implements Serializable {
        private int studentId;
        private int courseId;
        private String term;
    }
}
