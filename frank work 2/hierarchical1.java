 public class hierarchical1{
           public static void main(String[] args) {
        Car myCar = new Car("Sedan");
        Bike myBike = new Bike("Sports");

        myCar.displayType(); // Inherits the displayType() method and 'type' field from the Vehicle class
        myBike.displayType(); // Inherits the displayType() method and 'type' field from the Vehicle class
    }
}
class Vehicle {
    String type;

    Vehicle(String type) {
        this.type = type;
    }

    void displayType() {
        System.out.println("Type of vehicle: " + type);
    }
}

class Car extends Vehicle {
    Car(String type) {
        super(type);
    }
}

class Bike extends Vehicle {
    Bike(String type) {
        super(type);
    }}