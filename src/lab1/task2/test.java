package lab1.task2;

import java.util.ArrayList;

public  class test {
    public static void main(String[] args) {

        int year = 20;
        Course  course1 = new Course();
        Student[] students = new Student[3];
        for (int i = 0; i < 3; ++i) {
            students[i] = new Student();
        }
        course1.setStudents(students);


        course1.getStudents()[0].setname("Iulia");
        Integer t = new Integer(20);
        course1.getStudents()[0].setyear(t);
        course1.getStudents()[1].setname("Alex");
        course1.getStudents()[1].setyear(14);
        course1.getStudents()[2].setname("Maria");
        Integer t1 = new Integer(20);
        course1.getStudents()[2].setyear(t1);

        ArrayList<Student> lista = course1.filterYear(Integer.valueOf(year));

        for (int i = 0; i < lista.size(); ++i) {
            System.out.println(((Student)lista.get(i)).getName());
        }

        /** Task 3 **/

        Student student1 = new Student();
        Student student2 = new Student();
        student1.setname("Ana");
        student1.setyear(2);
        student2.setname("Ana");
        student2.setyear(2);
        System.out.println(student1.equals(student2));

        // Functia Equals returneaza "false" deoarece cele doua obiecte au adresa memoriei diferita!



        String s1 = "HELLO";
        String s2 = "HELLO";
        String s3 =  new String("HELLO");
        System.out.println(s1 == s2); // true
        System.out.println(s1 == s3); // false
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // true

    }

}
