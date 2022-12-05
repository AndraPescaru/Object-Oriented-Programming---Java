package lab3.task1;
import java.util.Objects;

public class CandyBox {
    private String flavor;
    private String origin;

    public CandyBox() {}

    public CandyBox( String flavor, String origin) {
        this.flavor = flavor;
        this.origin = origin;

    }

    public float getVolume() {
        return 0;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @Override
    public String toString () {
        return "The " + this.origin + " " + this.flavor ;
    }

    // Task 3
    @Override
    public boolean equals (Object p) {
        if (this == p) return true;
        if (!(p instanceof CandyBox)) {
            return false;
        }
        return flavor.equals(((CandyBox) p).flavor) && origin.equals(((CandyBox) p).origin);
    }

}
