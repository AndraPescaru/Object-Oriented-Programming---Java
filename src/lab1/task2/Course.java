package lab1.task2;

import java.util.ArrayList;
import java.util.List;

public class Course {

    private String title;
    private String description;
    private Student[] students = new Student[20];

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    List<Student> filterYear(int year) {
        List<Student> list = new ArrayList<>();
        for (int i = 0; i < students.length; ++i) {
            if (students[i].getYear().equals(year)) {
                list.add(students[i]);
            }
        }

        return list;
    }

}
