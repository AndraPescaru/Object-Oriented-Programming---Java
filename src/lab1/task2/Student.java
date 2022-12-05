package lab1.task2;

import java.util.Arrays;

public class Student {

    private String name;
    private Integer year;

    public Integer getyear() {
        return year;
    }
    public String getName() {
        return name;
    }

    public void setyear(Integer year) {
        this.year = year;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String toString() {
        return "Student{name='" + this.name + "', year=" + this.year + "}";
    }
}
