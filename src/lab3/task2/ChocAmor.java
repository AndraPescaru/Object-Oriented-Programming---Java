package lab3.task2;
import lab3.task1.CandyBox;

import java.util.Objects;


public class ChocAmor extends CandyBox{
    private float length;

    public ChocAmor() {
        this.length = 0;
    }

    public ChocAmor(String flavor1, String origin1, float length) {
        super(flavor1,origin1);
        this.length = length;
    }

    public float getVolume() {
        return (float)(Math.pow(this.length, 3));
    }

    public String toString() {

        return (super.toString()+ "chocolate has volume " + this.getVolume());
    }

    public void printChocAmorDim() {
        System.out.printf("Dimensiunea este %f", this.length);
    }


}
