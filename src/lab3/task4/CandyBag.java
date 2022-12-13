package lab3.task4;

import lab3.task1.CandyBox;
import lab3.task2.Baravelli;
import lab3.task2.ChocAmor;
import lab3.task2.Lindt;

import java.util.ArrayList;

public class CandyBag {

    private ArrayList<CandyBox> candybag = new ArrayList<>();

    public CandyBag () {

        Baravelli c1 = new Baravelli("cacao", "USA", 3, 3);
        Baravelli c2 = new Baravelli("lamaie", "Turcia", 4, 2);
        ChocAmor c3 = new ChocAmor("vanilie", "Romania", 5);
        Lindt c4 = new Lindt("capsuni", "Olanda", 4, 5, 8);

        candybag.add(c1);
        candybag.add(c2);
        candybag.add(c3);
        candybag.add(c4);
    }

    public ArrayList<CandyBox> getcandybag() {
        return candybag;
    }



}
