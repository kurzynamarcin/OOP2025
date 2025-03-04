// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Point p1 = new Point();
        p1.setX(5);
        p1.setY(6);

        Point p2 = new Point(7,8);
        System.out.println(p1.toSvg());
        System.out.println();
        System.out.println(p2.toSvg());

    }
}