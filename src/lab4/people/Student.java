package lab4.people;

import lab4.database.Database;

import javax.xml.crypto.Data;
import java.awt.dnd.DropTarget;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Student {
    private String firstName;
    private String lastName;
    private Map<String, Integer> subjects;

    public Student(String firstName, String lastName, Map<String, Integer> subjects) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subjects = subjects;
    }

    // TODO: copy constructor

    public Student(Student persone) {
        this.firstName = new String(persone.firstName);
        this.lastName = new String(persone.lastName);
        this.subjects = new HashMap<String, Integer>();
        for(Map.Entry<String, Integer> entry : persone.subjects.entrySet()){
            Integer aux = entry.getValue();
            this.subjects.put(entry.getKey(), aux);
        }
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

    public Map<String, Integer> getSubjects() {
        return subjects;
    }

    public void setSubjects(HashMap<String, Integer> subjects) {
        this.subjects = subjects;
    }

    public double averageGrade() {
        // TODO

        float sum = 0;

        for (Map.Entry<String,Integer> i : subjects.entrySet()) {
            sum += i.getValue();
        }
        return sum / subjects.size();
    }

    public List<Teacher> getAllTeachers() {
        // TODO
        return Database.getInstance().findAllTeachers();
    }

    public int getGradeForSubject(String subject) {
        for (Map.Entry<String,Integer> i : subjects.entrySet()) {
            if (i.getKey().equals(subject)) {
                return i.getValue();
            }

        }
        return 0;
    }

    @Override
    public String toString() {
        return "Student: " + firstName + " " + lastName + "\n"
                + "Subjects: " + subjects + "\n";
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
