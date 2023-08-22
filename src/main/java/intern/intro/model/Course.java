package intern.intro.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
public class Course {
    private String name;
    private String code;
    private int hours;

    public Course(String name, String code, int hours) {
        this.name = name;
        this.code = code;
        this.hours = hours;
    }
}
