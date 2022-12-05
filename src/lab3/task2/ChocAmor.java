package lab3.task2;

import lab3.task1.CandyBox;

public class ChocAmor extends CandyBox {

    private float length;

    public ChocAmor () {}

    public ChocAmor (String flavor, String origin, float length) {
        super(flavor, origin);
        this.length = length;
    }

    public float getVolume() {
        return this.length * this.length * this.length;
    }

    @Override
    public String toString () {
        return super.toString() + " has volume " + this.getVolume();
    }
    public void printChocAmorDim() {
        System.out.println(this.length);
    }
}
