// Parent class
class Animal {
    String type;

    // Constructor
    Animal(String type) {
        this.type = type;
        System.out.println("Animal constructor called");
    }

    void makeSound() {
        System.out.println("Animal makes sound");
    }
}

// Child class inherits Animal
class Dog extends Animal {
    String breed;

    // Constructor using 'super' to call parent constructor
    Dog(String type, String breed) {
        super(type); // Call Animal constructor
        this.breed = breed;
        System.out.println("Dog constructor called");
    }

    // Method overriding
    @Override
    void makeSound() {
        System.out.println("Dog barks 🐶");
    }

    void showDetails() {
        System.out.println("Type: " + type);
        System.out.println("Breed: " + breed);
    }
}

// Main class to run
public class AnimalDemo {
    public static void main(String[] args) {
        Dog d1 = new Dog("Mammal", "Labrador");
        d1.makeSound();      
        d1.showDetails();    
    }
}
