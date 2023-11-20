 public class hierarchical2{
   public static void main(String[] args) {
        Student student = new Student("John", 123);
        Teacher teacher = new Teacher("Mr. Smith", "Math");

        student.displayStudentInfo();
        teacher.displayTeacherInfo();
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
    }
}

class Teacher extends Person {
    String subject;

    Teacher(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    void displayTeacherInfo() {
        displayInfo(); // Inherits the displayInfo() method from the Person class
        System.out.println("Subject: " + subject);
    }}   