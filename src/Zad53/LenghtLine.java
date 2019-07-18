package Zad53;

public class LenghtLine {
    public double lenghtLine (int x1, int y1, int x2, int y2){
        return Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
    }

    public boolean isTriangle (int x1, int y1, int x2, int y2, int x3, int y3){
        return ((y1-y2)/(x1-x2) != (y1-y3)/(x1-x3));
    }
}
