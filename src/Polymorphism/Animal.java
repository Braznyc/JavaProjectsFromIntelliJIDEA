package Polymorphism;

public class Animal {

    private String name;
    public Animal(String name) {
        this.name = name;
    }
    public String sound() {
        return "Rawr";
    }
    public String toString() {
        return name.concat(" says ").concat(sound());
    }
}

class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }
    @Override
    public String sound() {
        return "Woof";
    }
}

class Cat extends Animal {
    public Cat(String name){
        super(name);
    }
    @Override
    public String sound() {
        return "Meow";
    }
}

class Cow extends Animal {
    public Cow(String name){
        super(name);
    }
     @Override
    public String sound() {
        return "Moo";
    }
}

class Cricket extends Animal {
    public Cricket(String name){
        super(name);
    }
    @Override
    public String sound() {
        return "Cree-Cree";
    }
}

class Goat extends Animal {
    public Goat(String name){
        super(name);
    }
    @Override
    public String sound() {
        return "MEEE";
    }
}