package lab3.task2;

import lab3.task1.CandyBox;

public class Baravelli extends CandyBox {

    private float radius;
    private float height;
    private double pi = 3.14159265359;

    public Baravelli () {}

    public Baravelli (String flavor, String origin, float radius, float height) {
        super(flavor, origin);
        this.radius = radius;
        this.height = height;
    }
    public float getVolume() {
        return this.radius * this.radius * this.height * ( float) pi;
    }

    @Override
    public String toString () {
        return super.toString() + " has volume " + this.getVolume();
    }

    public void printBaravelliDim() {
        System.out.println(this.radius);
        System.out.println(this.height);
    }
}
