package playground.week1.homework.point;

public class PointMain {
    public static void main(String[] args) {

        Point point1 = new Point(6, 8);
        Point point2 = new Point(4, 4);
        Point point3 = new Point(0, 0);

        System.out.println(point1.distance(point2));
        System.out.println(point3.distance(point1));
        System.out.println(point2.distance(point3));
    }
}
