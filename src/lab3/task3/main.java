package lab3.task3;

import lab3.task2.Lindt;
import lab3.task1.CandyBox;

import java.awt.geom.Area;
import java.util.Objects;

public class main {
    public static void main( String [] args) {
        CandyBox box = new CandyBox();

        System.out.printf("%s %s\n", box.getFlavor(),box.getOrigin());

        System.out.println(box.getVolume());

        Lindt obj1 = new Lindt( "Romania", "ciocolata", 1, 2, 3);
        Lindt obj2 = new Lindt("Romania", "ciocolata", 1, 2, 3);
        Lindt obj3 = new Lindt("Rusia", "Vanilie", 1, 2, 3);
        System.out.println(obj1.equals(obj2));
        System.out.println(obj1.equals(obj3));



    }

}
