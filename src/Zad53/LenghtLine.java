package Zad53;

public class LenghtLine {
    Graph point1 = new Graph();
    Graph point2 = new Graph();
    Graph point3 = new Graph();

    public double lenghtLine (){
        return Math.sqrt(Math.pow(point2.getX()-point1.getX(),2)+Math.pow(point2.getY()-point1.getY(),2));
    }

    public boolean isTriangle (){
        return ((point1.getY()-point2.getY())/(point1.getX()-point2.getX()) != (point1.getY()-point3.getY())/(point1.getX()-point3.getX()));


    }
}
