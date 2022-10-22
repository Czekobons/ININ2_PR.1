public class Car {
    final String model;
    final String producer;
    Double power;
    String color;
    Integer yearOfProduction;
    Boolean working;

    Car(String producer, String model) {
        this.working = true;
        this.producer = producer;
        this.model = model;
    }
}
