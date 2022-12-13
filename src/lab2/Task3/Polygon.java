package lab2.Task3;

public class Polygon {
    Point[] point;

    public Polygon(int n, Point point) {
        this.point = new Point[n];
    }

    public Polygon(float[] v) {
        int k = 0;

        for (int i = 0 ; i < point.length / 2 ; ++i) {
            this.point[i] = new Point(v[k],v[k+1]);
            k += 2;
        }
    }
}
