// Abstract class - cannot be instantiated directly
abstract class Vehicle {
    String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    // Abstract method - no body, subclass MUST implement
    abstract void start();
    abstract void stop();

    // Concrete method - has a body, shared by all subclasses
    void showBrand() {
        System.out.println("Brand: " + brand);
    }
}

// Concrete class - provides implementation for abstract methods
class Car extends Vehicle {
    Car(String brand) {
        super(brand);
    }

    void start() {
        System.out.println(brand + " Car starts with a key ignition");
    }

    void stop() {
        System.out.println(brand + " Car stops with brake pedal");
    }
}

class Bike extends Vehicle {
    Bike(String brand) {
        super(brand);
    }

    void start() {
        System.out.println(brand + " Bike starts with a kick");
    }

    void stop() {
        System.out.println(brand + " Bike stops with hand brake");
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        // Vehicle v = new Vehicle("Test");  // ERROR! Cannot instantiate abstract class

        Vehicle car = new Car("Toyota");
        Vehicle bike = new Bike("Honda");

        car.showBrand();
        car.start();    // User just calls start(), doesn't know HOW it starts
        car.stop();

        System.out.println();

        bike.showBrand();
        bike.start();
        bike.stop();
    }
}
