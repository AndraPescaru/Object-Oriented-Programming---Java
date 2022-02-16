package lab1.task2;

import java.util.List;

public  class test {
    public static void main(String[] args) {

        Course  course1 = new Course();
        Student[] students = new Student[3];
        for (int i = 0; i < 3; ++i) {
            students[i] = new Student();
        }
        course1.setStudents(students);
        course1.getStudents()[0].setName("Iulia");
        Integer t = new Integer(20);
        course1.getStudents()[0].setYear(t);
        course1.getStudents()[1].setName("Alex");
        course1.getStudents()[1].setYear(14);
        course1.getStudents()[2].setName("Maria");
        Integer t1 = new Integer(20);
        course1.getStudents()[2].setYear(t1);

        List<Student> students1 = course1.filterYear(20);
        /**
        for (String s : students1) {
            System.out.println(s.getName());
        }
         **/
        for (int i = 0; i < students1.size(); ++i) {
            System.out.println(students1.get(i).getName());
        }

    }

}
