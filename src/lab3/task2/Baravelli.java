package lab3.task2;
import lab3.task1.CandyBox;
import java.util.Objects;

public class Baravelli extends CandyBox{
    private float height;
    private float radius;

    public Baravelli() {
        this.height = 0;
        this.radius = 0;

    }

    public Baravelli(String flavor1, String origin1, float height, float radius) {
        super(flavor1,origin1);
        this.height = height;
        this.radius = radius;
    }

    public float getVolume() {
        return (float)(this.height * Math.pow(this.radius, 2) * Math.acos(-1.0));
    }

    public String toString() {

        return (super.toString()+ "chocolate has volume " + this.getVolume());
    }

    public void printBaravelliDim() {
        System.out.printf("Dimensiunea este %f %f", this.height, this.radius);
    }
}

