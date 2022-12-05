package lab2.task3;

public class Point {
    private float x;
    private float y;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void changeCoords(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public  void display () {
        System.out.printf("Coordonatele sunt x = %f si y = %f\n", this.x, this.y);
    }

    @Override
    public String toString () {
        return "Coordonatele sunt x = " + this.x + " y = " + this.y;
    }

};


