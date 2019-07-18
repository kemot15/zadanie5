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
        return getX()>0 && getY()>0;
    }

    public boolean quarter2 (){
        return getX()>0 && getY()<0;
    }

    public boolean quarter3 (){
        return getX()<0 && getY()<0;
    }

    public boolean quarter4 (){
        return getX()<0 && getY()>0;
    }

    public boolean axisX (){
        return getX()==0 && getY()!=0;
    }

    public boolean axisY (){
        return getX()!=0 && getY()==0;
    }

    public boolean center (){
        return getX()==0 && getY()==0;
    }


}
