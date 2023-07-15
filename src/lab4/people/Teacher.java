package lab4.people;

import lab4.database.Database;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Teacher {
    private String firstName;
    private String lastName;
    private List<String> subjects;

    public Teacher(String firstName, String lastName, List<String> subjects) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subjects = subjects;
    }

    // TODO: copy constructor

    public Teacher(Teacher teacher) {
        this.firstName = new String(teacher.firstName);
        this.lastName = new String(teacher.lastName);
        this.subjects = new ArrayList<>();
        for (String i : teacher.subjects) {
            this.subjects.add(new String(i));
        }
    }

    @Override
    public String toString() {
        return "Teacher: " + firstName + " " + lastName + "\n"
                + "Subjects: " + subjects + "\n";
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    public List<Teacher> getAllTeachers() {
        // TODO
        return Database.getInstance().findAllTeachers();
    }

    public List<Teacher> getTeachersBySubject(String subject) {
        // TODO
        return Database.getInstance().findTeachersBySubject(subject);
    }

    public List<Student> getAllStudents() {
        // TODO
        return Database.getInstance().findAllStudents();
    }

    public List<Student> getStudentsBySubject(String subject) {
        // TODO
        return Database.getInstance().getStudentsBySubject(subject);
    }

    public List<Student> getStudentsByAverageGrade() {
        // TODO
        return Database.getInstance().getStudentsByAverageGrade();
    }

    public List<Student> getStudentsByGradeForSubject(String subject) {
        // TODO
        return Database.getInstance().getStudentsByGradeForSubject(subject);
    }
}
