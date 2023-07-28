package Lab6.task1;

public class Car {
    private Integer pret;

    public Integer getPret() {
        return pret;
    }

    public void setPret(Integer pret) {
        this.pret = pret;
    }

    public CarType getCartype() {
        return cartype;
    }

    public void setCartype(CarType cartype) {
        this.cartype = cartype;
    }

    public Integer getAn_fabricatie() {
        return an_fabricatie;
    }

    public void setAn_fabricatie(Integer an_fabricatie) {
        this.an_fabricatie = an_fabricatie;
    }

    private CarType cartype;
    private Integer an_fabricatie;

    enum CarType{
        Mercedes,
        Fiat,
        Skoda
    }

    public  Car(Integer pret1, CarType cartype1, Integer an_fabricatie1) {
        this.pret = pret1;
        this.cartype =cartype1;
        this.an_fabricatie = an_fabricatie1;
    }

    @Override
    public String toString() {
        return "Car{" +
                "pret=" + pret +
                ", cartype=" + cartype +
                ", an_fabricatie=" + an_fabricatie +
                '}';
    }
}
