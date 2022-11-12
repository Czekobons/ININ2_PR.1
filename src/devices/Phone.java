package devices;

public class Phone {
    public String producer;
    public String model;
    public int storage;
    public double screenSize;
    public int batteryCapacity;

    public Phone(String producer, String model, int storage, double screenSize, int batteryCapacity) {
        this.producer = producer;
        this.model = model;
        this.storage = storage;
        this.screenSize = screenSize;
        this.batteryCapacity = batteryCapacity;
    }
    public String toString() {
        return producer+", "+model+", "+storage+"GB, "+screenSize+ "cali, "+batteryCapacity+"mAh.";
    }
}
