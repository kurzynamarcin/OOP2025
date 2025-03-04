// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Point p1 = new Point();
        p1.setX(5);
        p1.setY(6);

        Point p2 = new Point(7,8);

        Point p3 = new Point(p1);
        Point p4 = new Point(p2);


        Segment s1 = new Segment(p1,p2);
        Segment s2 = new Segment(p3,p4);
        p1.setX(15);
        p1.setY(12);
        p2.setX(15);
        p2.setY(8);


    }
}








