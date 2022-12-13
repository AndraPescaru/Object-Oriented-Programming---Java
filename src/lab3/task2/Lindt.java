package lab3.task2;

import lab3.task1.CandyBox;

import javax.swing.plaf.SeparatorUI;

public class Lindt extends CandyBox {
    private float length;
    private float width;
    private float height;

    public Lindt() {
        this.length = 0;
        this.width = 0;
        this.height = 0;
    }

    public Lindt(String flavor1, String origin1, float length, float width, float height) {
        super(flavor1, origin1);
        this.length = length;
        this.width = width;
        this.height = height;
    }
    public float getVolume() {
        return this.length * this.width * this.height;
    }

    public String toString() {

        return (super.toString()+ "chocolate has volume " + this.getVolume());
    }

    public void printLindtDim() {
        System.out.printf("Dimensiunea este %f %f % f", this.length, this.width, this.height);
    }
}
