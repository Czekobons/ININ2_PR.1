public class Animal {

    final String species;
    public String name;
    public Double weight;
    public Boolean isAlive;

    public Animal(String species, Double weight) {
        this.isAlive = true;
        this.species = species;
        this.weight =  weight;
    }
    void feed() {
        if(this.weight>0&& this.isAlive) {
            this.weight += 0.4;
            System.out.println("Thanks for food!");
        }
        else {
            System.out.println("Congratualtion, your animal staved to death.");
        }
    }
    void takeForWalk() {
        if(this.isAlive&&this.weight>0) {
            this.weight -= 0.5;
            System.out.println("Nice walk.");
        }
        else {
            System.out.println("The police have been notified of your negligence.");
        }
    }
    public String toString() {
        return species+", "+isAlive+", "+weight;
    }
}
