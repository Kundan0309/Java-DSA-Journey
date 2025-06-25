//definig class
class Student {
    String name;
    int age;

    // defining constructor
    Student(String studentName, int studentAge) {
        this.name = studentName;
        this.age = studentAge;
    }

    // Method to print Student details
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("age: " + age);
    }
}

// main class to get ressults
public class StudentDemo {
    public static void main(String[] args) {
        // create object of Student and call constructor
        Student s1 = new Student("Kundan", 20);

        // call method tod display
        s1.displayInfo();
    }
}
