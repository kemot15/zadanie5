package Zad53;

public class Line {
    Graph point1 = new Graph();
    Graph point2 = new Graph();

    public double lenght (){
        return Math.sqrt(Math.pow(point2.getX()-point1.getX(),2)+Math.pow(point2.getY()-point1.getY(),2));
    }
}
