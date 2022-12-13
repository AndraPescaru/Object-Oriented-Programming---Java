package lab3.task1;
import java.util.Objects;

public class CandyBox {
    private String flavor;
    private String origin;


    public CandyBox(){
        this.flavor = "sugar-free";
        this.origin = "Switzerland";

    }

    public CandyBox(String flavor1, String origin1) {
        this.flavor = flavor1;
        this.origin = flavor1;
    }

    public float getVolume() {
        return 0;
    }

    public String getFlavor() {
        return this.flavor;
    }

    public String getOrigin() {
        return this.origin;
    }

    @Override
    public String toString() {

        return ("The" + this.flavor + " "+ this.origin + "chocolate");
    }

    public boolean equals(Object box) {

        if (this == box) return true; // Comparatia asta se face intre adresele celor doua obiecte

        if (box == null  || getClass() != box.getClass()) return false;

        CandyBox candybox = (CandyBox) box;

        return flavor.equals(candybox.flavor) && origin.equals(candybox.origin); // se compara valorile celor lor


    }

}