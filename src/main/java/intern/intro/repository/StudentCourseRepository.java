package intern.intro.repository;

import intern.intro.model.StudentCourse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentCourseRepository extends JpaRepository<StudentCourse, StudentCourse.CompositeKey> {
}
