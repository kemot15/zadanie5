package Zad53;

public class Graph {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean quarter1 (){
        return x>0 && y>0;
    }

    public boolean quarter2 (){
        return x>0 && y<0;
    }

    public boolean quarter3 (){
        return x<0 && y<0;
    }

    public boolean quarter4 (){
        return x<0 && y>0;
    }

    public boolean axisX (){
        return x==0 && y!=0;
    }

    public boolean axisY (){
        return x!=0 && y==0;
    }

    public boolean center (){
        return x==0 && y==0;
    }


}
