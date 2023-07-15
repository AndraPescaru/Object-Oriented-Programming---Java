package lab4.database;
import java.util.Collections;
import lab4.people.Student;
import lab4.people.Teacher;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class Database {
    private final List<Student> students = new ArrayList<>();
    private final List<Teacher> teachers = new ArrayList<>();
    private static int numberofinstance = 0;

    // TODO: make it Singleton

    private static Database instance = null;

    private Database() {
        numberofinstance++;
    }

    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    public static int getNumberOfInstances() {
        return numberofinstance;
    }

    public void addTeachers(List<Teacher> teachers) {
        this.teachers.addAll(teachers);
    }

    public void addStudents(List<Student> students) {
        this.students.addAll(students);
    }

    public List<Teacher> findTeachersBySubject(String subject) {
        // TODO
        List<Teacher> lista = new ArrayList<>();

        for (int i = 0; i < teachers.size(); i++) {
            if (teachers.get(i).getSubjects().equals(subject)) {
                lista.add(teachers.get(i));
            }
        }
        return Collections.unmodifiableList(lista);
    }

    public List<Student> findAllStudents() {
        // TODO
        return Collections.unmodifiableList(students);
    }

    public List<Teacher> findAllTeachers() {
        // TODO
        return Collections.unmodifiableList(teachers);
    }

    public List<Student> getStudentsBySubject(String subject) {
        // TODO

        List<Student> lista = new ArrayList<>();

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getSubjects().equals(subject)) {
                lista.add(students.get(i));
            }
        }
        return Collections.unmodifiableList(lista);
    }

    public List<Student> getStudentsByAverageGrade() {
        // TODO

//        students.sort(new Comparator<>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return Double.compare(o1.averageGrade(), o2.averageGrade());
//            }
//        });

//        students.sort((o1, o2) -> Double.compare(o1.averageGrade(), o2.averageGrade()));
//
//        students.sort(Comparator.comparingDouble(Student::averageGrade));


        for (int i = 0; i < students.size(); i++) {
            for (int j = i + 1; j < students.size(); j++) {
                if (students.get(i).averageGrade() > students.get(j).averageGrade()) {
                    Collections.swap(students,i,j);
                }
            }
        }

        return Collections.unmodifiableList(students);

    }

    public List<Student> getStudentsByGradeForSubject(String subject) {

        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Integer.compare(o1.getGradeForSubject(subject), o2.getGradeForSubject(subject));
            }
        });

        return Collections.unmodifiableList(students);
    }
}