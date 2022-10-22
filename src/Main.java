public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Animal dog = new Animal("dog");
        Animal cat = new Animal("cat");
        dog.name = "Luna";
        cat.name = "Stonka";
        dog.weight = 120.0;
        cat.weight = 3.0;
        do {
            if (dog.weight > 100) {
                System.out.println("Twoj obiekt jest gruby");
                dog.weight -= 10.0;
            }
        }
        while (dog.weight > 100);
        System.out.println("Czy " + dog.name + " żyje? " + dog.isAlive);
        System.out.println(dog.species);
        System.out.println("Czy " + cat.name + " żyje? " + cat.isAlive);
        System.out.println(cat.species);

        for (int i = 0; i < 10; i++) {
            cat.takeForWalk();
            cat.takeForWalk();
            cat.feed();

            if (cat.weight <= 0) {
                cat.isAlive = false;
                System.out.println("Twoje zwierze umarlo");
                break;
            }
        }

        System.out.println(dog.name + " wazy " + dog.weight + " kg.");

        Human me = new Human();
        me.pet = new Animal("elephant");
        me.pet.feed();

        me.pet = dog;
        Car tesla = new Car("Tesla", "Model 3");
        me.car = tesla;
        tesla.power = 1000.0;
        tesla.color = "blue";
        tesla.yearOfProduction = 2018;


    }
}