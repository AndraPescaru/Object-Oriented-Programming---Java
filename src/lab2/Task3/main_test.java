package lab2.Task3;

// Clasa pentru testatrea clasei Point si Polygon

public class main_test {

    public static void main(String[] args){

        Point p = new Point(2, (float)5.3);

        p.showPoint();

        p.changeCoords((float)45.3, (float)34.23);

        System.out.println(p.toString());

        p.setX((float) 543.3);
        p.setY((float) 54.3);

        System.out.println(p.getX());
        System.out.println(p.getY());

        float[] points = {4, (float)5.2, (float)4.5, (float)3.5, (float)9.5, (float)0.5};
        Polygon poly = new Polygon(points);

        for(int i = 0; i < poly.point.length; ++i){
            poly.point[i].showPoint();
        }

    }
}