package lab3.task2;

import lab3.task1.CandyBox;

import javax.swing.plaf.SeparatorUI;

public class Lindt extends CandyBox {

    private float length;
    private float width;
    private float height;

    public Lindt() {}
    public Lindt (String flavor, String origin, float length, float width, float height ) {
        super(flavor, origin);
        this.length = length;
        this.height = height;
        this.width = width;
    }
    public float getVolume() {
        return this.length * this.width * this.height;
    }

    @Override
    public String toString () {
        return super.toString() + " has volume " + this.getVolume();
    }

    public void printLindtDim() {
        System.out.println(this.length);
        System.out.println(this.height);
        System.out.println(this.width);

    }


}
