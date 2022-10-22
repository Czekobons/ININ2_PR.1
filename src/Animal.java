public class Animal {

    final String species;
    String name;
    Double weight;
    Boolean isAlive;

    Animal(String species) {
        this.isAlive = true;
        this.species = species;
    }
    void feed() {
        if(this.weight>0&& this.isAlive) {
            this.weight += 0.4;
            System.out.println("Dzieki za zarcie");
        }
        else {
            System.out.println("Gratulacje, zagłodziłeś swoje zwierze");
        }
    }
    void takeForWalk() {
        if(this.isAlive&&this.weight>0) {
            this.weight -= 0.5;
            System.out.println("Super spacer");
        }
        else {
            System.out.println("Policja została powiadomiona o twoim zaniedbaniu");
        }
    }
}
