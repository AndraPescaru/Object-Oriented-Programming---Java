package lab3.task3;

import lab3.task2.Lindt;

public class main {
    public static void main( String [] args) {
        Lindt a = new Lindt("vanilie", "USA", 3, 2, 5);
        Lindt b = new Lindt("vanilie", "USA", 3, 2, 5);
        Lindt c = new Lindt("cacao", "Romania" , 4, 4, 2);

        System.out.println(a.equals(b));
        System.out.println(a.equals(c));

    }

}
