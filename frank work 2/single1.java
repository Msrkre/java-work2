 public class single1{
public static void main(String[] args) {
        Student student = new Student("John", 123);
        student.displayStudentInfo();
    }
}
class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
    }
}

class Student extends Person {
    int rollNumber;

    Student(String name, int rollNumber) {
        super(name);
        this.rollNumber = rollNumber;
    }

    void displayStudentInfo() {
        displayInfo(); // Inherits the displayInfo() method from the Person class
        System.out.println("Roll Number: " + rollNumber);
    }}