import devices.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Animal dog = new Animal("dog", 120.0);
        Animal cat = new Animal("cat", 5.0);
        dog.name = "Luna";
        cat.name = "Stonka";
        do {
            if (dog.weight > 100) {
                System.out.println("Your object is fat.");
                dog.weight -= 10.0;
            }
        }
        while (dog.weight > 100);
        System.out.println("Is " + dog.name + " alive? " + dog.isAlive);
        System.out.println(dog.species);
        System.out.println("Is " + cat.name + " alive? " + cat.isAlive);
        System.out.println(cat.species);

        for (int i = 0; i < 10; i++) {
            cat.takeForWalk();
            cat.takeForWalk();
            cat.feed();

            if (cat.weight <= 0) {
                cat.isAlive = false;
                System.out.println("Your pet pass away.");
                break;
            }
        }

        System.out.println(dog.name + " weight " + dog.weight + " kg.");

        Human me = new Human("Adam", "Nowak", 1980,1000.0);
        me.pet = new Animal("Elephant", 1000.0);
        me.pet.weight = 1000.0;
        me.pet.feed();
        me.pet = dog;

        Car tesla = new Car("Tesla", "Model 3", 10000.0);
        Car tesla2 = new Car("Tesla", "Model 3", 10000.0);
        tesla.power = 1000.0;
        tesla.color = "Blue";
        tesla.yearOfProduction = 2018;

        Phone onePlus = new Phone("OnePlus", "7 Pro", 256, 7, 4000);

        me.setSalary(2000.0);
        me.getSalaryInfo();
        me.setSalary(3000.0);
        me.getSalaryInfo();
        me.setSalary(4000.0);
        me.getSalaryInfo();

        me.setCar(tesla);
        System.out.println("Getter " + me.getCar());
        System.out.println();
        //Zadanie 6
        System.out.println(tesla.equals(tesla2));
        System.out.println(dog);
        System.out.println(tesla+". "+tesla2);

        System.out.println(dog);
        System.out.println(me);
        System.out.println(tesla);
        System.out.println(onePlus);




    }
}