package Zad53;

public class LenghtLine {
    private int x1;
    private int x2;
    private int x3;
    private int y1;
    private int y2;
    private int y3;

    public LenghtLine(int x1, int x2, int x3, int y1, int y2, int y3) {
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
    }

    public double lenghtLine (){
        return Math.sqrt(Math.pow(this.x2-this.x1,2)+Math.pow(this.y2-this.y1,2));
    }

    public boolean isTriangle (){
        return ((this.y1-this.y2)/(this.x1-this.x2) != (this.y1-this.y3)/(this.x1-this.x3));


    }
}
