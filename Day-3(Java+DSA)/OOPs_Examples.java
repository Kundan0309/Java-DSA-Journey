class OOPSs_Examples {
    String name;
    int age;

    // Constructor
    OOPSs_Examples(String name, int age) {
        this.name = name;     // using 'this' to refer to current object's field
        this.age = age;
    }

    // Method
    void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Method Overloading
    void printInfo(String name) {
        System.out.println("Name (Overloaded): " + name);
    }

    void printInfo(int age) {
        System.out.println("Age (Overloaded): " + age);
    }

    void printInfo(String name, int age) {
        System.out.println("Name & Age: " + name + ", " + age);
    }
}

public class OOPs_Examples {
    public static void main(String[] args) {
        // Creating object
        OOPSs_Examples s1 = new OOPSs_Examples("Kundan",21);

        // Accessing object properties and methods
        s1.printInfo();                   // Original method
        s1.printInfo("Kundan Kumar");    // Overloaded
        s1.printInfo(21);                // Overloaded
        s1.printInfo("Kundan", 21);      // Overloaded
    }
}
