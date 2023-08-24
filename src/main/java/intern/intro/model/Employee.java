package intern.intro.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "employee")
@Data
public class Employee {
    @Id
    @Column(name = "emp_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String employeeName;

    @JoinColumn(name = "dep")
    @ManyToOne
    private Department department;

    @Transient
    private Integer departmentId;
}
