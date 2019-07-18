package Zad53;

public class GraphTest {
    public static void main(String[] args) {
        LenghtLine line = new LenghtLine();
        line.point1.setX(-3);
        line.point1.setY(3);
        line.point2.setX(2);
        line.point2.setY(4);
        line.point3.setX(-1);
        line.point3.setY(2);
        System.out.println(line.isTriangle());
    }
}
