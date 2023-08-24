package intern.intro.model;

import jakarta.persistence.*;
import lombok.Data;

import java.awt.print.Book;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "department")
@Data
public class Department {
    @Id
    @Column(name = "dep_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String departmentName;

//    @OneToMany(targetEntity = Employee.class)
//    private List<Employee> employees;
}
