package lab3.task6;

import jdk.jfr.Label;
import lab3.task1.CandyBox;
import lab3.task2.Baravelli;
import lab3.task2.ChocAmor;
import lab3.task2.Lindt;
import lab3.task4.CandyBag;

import java.util.ArrayList;

public class Area {
    private CandyBag bag = new CandyBag();
    private int number;
    private String street;

    public Area() {}
    public Area(int number, String street) {
        this.number = number;
        this.street = street;
    }

    public void getBirthdayCard() {
        System.out.printf("Number %d, Str. %d, La multi ani!", this.number, this.street);

        ArrayList<CandyBox> Box = bag.getcandybag();

        // instanceof

        for (CandyBox i : Box) {
            if (i instanceof Baravelli) {
                System.out.println(((Baravelli)i).toString());
            }

            if (i instanceof ChocAmor) {
                System.out.println(((ChocAmor)i).toString());
            }

            if (i instanceof Lindt) {
                System.out.println(((Lindt)i).toString());
            }
        }

        for (CandyBox i : Box) {
            System.out.println(i.toString());
        }

    }

}
