package devices;

public class Car {
    final String model;
    final String producer;
    public Double power;
    public String color;
    public Integer yearOfProduction;
    public Boolean working;
    public Double price;

    public Car(String producer, String model, Double price) {
        this.working = true;
        this.producer = producer;
        this.model = model;
        this.price  = price;
    }
    public Object clone() {
        Car aClone = new Car(this.producer, this.model, this.price);
        return aClone;
    }
    public String toString() {
        return producer+", "+model+", "+price;
    }
}
