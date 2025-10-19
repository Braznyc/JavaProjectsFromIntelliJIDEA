package Polymorphism;

public class AnimalFarm1 {
    public static void main(String[] args) {

        
        Animal animal1 = new Dog("Sami");
        Animal animal2 = new Cat("Hershery");
        Animal animal3 = new Cow("Molly");
        Animal animal4 = new Cricket("Jumpy");
        Animal animal5 = new Goat("Zecao");
        Animal animal6 = new Animal("Baby"); // This was created directly from the super class.
        System.out.println("animal1 sound " + animal1.sound());
        System.out.println("animal2 sound " + animal2.sound());
        System.out.println("animal3 sound " + animal3.sound());
        System.out.println("animal4 sound " + animal4.sound());
        System.out.println("animal5 sound " + animal5.sound());
        System.out.println("animal6 sound " + animal6.sound()); // This will return the default sound "Rawr".
    }
}


