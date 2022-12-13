package lab3.task4;

import java.lang.annotation.Retention;
import java.lang.reflect.Array;
import java.util.ArrayList;
import lab3.task1.CandyBox;
import lab3.task2.Baravelli;
import lab3.task2.ChocAmor;
import lab3.task2.Lindt;
import lab3.task4.CandyBag;

public class CandyBag {
    private ArrayList Bag = new ArrayList<>();

    public CandyBag() {

        Baravelli Candy1 = new Baravelli("ciocolata", "Romania", 2, 3);
        ChocAmor Candy2 = new ChocAmor("vanilie", "Belgia", 6);
        Lindt Candy3 = new Lindt("frisca", "Luxemburg", 1, 2, 3);

        Bag.add(Candy1);
        Bag.add(Candy2);
        Bag.add(Candy3);
    }

    public ArrayList<CandyBox> getBag() {
        return this.Bag;
    }

}