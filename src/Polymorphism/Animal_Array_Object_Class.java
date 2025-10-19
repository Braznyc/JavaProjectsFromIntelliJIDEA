package Polymorphism;

import java.util.Scanner;

class AnimalFarm2 {
    public static void main(String s[]) {
        Scanner scanner = new Scanner(System.in);
        Animal[] animals = new Animal[10];  //Declares and creates an array that can hold up to 10 references to Animal objects. ***Initially, all slots are null***.

        int anmlIdx = 0; // An index counter to keep track of the next available (empty) position in the animals array.
        while(true) {
            System.out.println(	"Press 1 to view the animals, " +
                    "\n2 to add animals, "+
                    "\nany other key to exit");
            String userAction = scanner.nextLine();
            if (userAction.equals("1")) {  // View Animals. This block handles the user's request to see all existing animals.
                for(int i=0;i<animals.length;i++) {  //Loops through every slot in the animals array.
                    if(animals[i] != null) {        // Checks for null: If the array slot is not empty.
                        System.out.println(animals[i]); // If it's not null like decided above, it outputs the animal object. This triggers the object's toString() method (from Dog, Cat, or Cow), showing its details.
                    }
                }
            } else if (userAction.equals("2")) { // This block handles adding a new animal.
                if(anmlIdx == 10) {   // Checks Capacity: First, it checks if the array is already full (anmlIdx has reached 10, the array's length). If full, it prints an error message and uses continue to skip the rest of the loop and go back to the menu.
                    System.out.println("10 animals added already. Cannot add any more animals!");
                    continue;
                }
                System.out.println("Which animal do you want to create? \nPress 1 for dog,"+
                        "\n2 for cat " +
                        "\n3 for cow" );
                String animalChoice = scanner.nextLine();
                if (animalChoice.equals("1")) {
                    System.out.println("Enter the name of the dog");
                    String dogName = scanner.nextLine();
                    Animal anmlTmp = new Dog(dogName);
                    animals[anmlIdx++] = anmlTmp;
                } else if (animalChoice.equals("2")) {
                    System.out.println("Enter the name of the cat");
                    String catName = scanner.nextLine();
                    Animal anmlTmp = new Cat(catName);
                    animals[anmlIdx++] = anmlTmp;
                } else if (animalChoice.equals("3")) {
                    System.out.println("Enter the name of the cow");
                    String cowName = scanner.nextLine();
                    Animal anmlTmp = new Cow(cowName);
                    animals[anmlIdx++] = anmlTmp;
                }
            } else {
                break;
            }
        }
    }
}