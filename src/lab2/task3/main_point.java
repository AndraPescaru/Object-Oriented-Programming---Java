package lab2.task3;

public class main_point {

    public static void main( String [] args) {
        Point p = new Point((float) 7.6 , (float) 8.7);

       // p.display();

        p.changeCoords((float) 5.8, (float) 9.9);

        System.out.println(p.toString());

        p.setX((float) 9.98);
        p.setX((float) 7.99);

        System.out.println(p.getX());
        System.out.println(p.getY());

        float[] points = { 4, (float) 6.7, (float) 9.97, (float) 9, (float) 5.32, (float) 1.12, (float) 22.1, (float) 9.92};
        Polygon poly =  new Polygon(points);

        for (int i = 0; i < points.length / 2; ++i) {
            poly.p[i].display();

        }

    }

}

