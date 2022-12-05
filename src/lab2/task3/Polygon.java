
package lab2.task3;

public class Polygon {

    Point[] p;

    public Polygon(int n) {

        p = new  Point[n];
    }

    public Polygon(float [] points) {
        int k = 0;

        for (int i = 0; i < points.length / 2; ++i) {
            this.p[i] = new Point(points[k], points[k+1]);
            k += 2;
        }
    }

}