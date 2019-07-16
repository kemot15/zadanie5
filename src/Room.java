public class Room {
    private double area;
    private double temperature;
    private boolean aircon;
    private double low;

    public Room(double area, double temperature, boolean aircon, double low) {
        this.area = area;
        this.temperature = temperature;
        this.aircon = aircon;
        this.low = low;
    }

    public boolean decreaseTemp(){
        if (aircon && temperature>low) {
            temperature--;
            return true;
        }else return false;
    }
}
