package Zad52;

public class Device {
    private String code;
    private String producer;
    private String type;
    private double price;

    public Device(String code, String producer, String type) {
        this.code = code;
        this.producer = producer;
        this.type = type;
    }

    public Device(String code, String producer, String type, double price) {
        this(code, producer,type);
        this.price = price;
    }

    public String getInfo (){
        return "Kod: " + this.code + ", producent: " + this.producer + ", typ: " + type + ", cena: " + this.price;
    }

}
