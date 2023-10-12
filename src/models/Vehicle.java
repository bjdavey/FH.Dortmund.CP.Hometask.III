
package models;

public abstract class Vehicle {

    public Vehicle(int id, String make, String model, int yearOfManufacture, String color, double price,
            String registrationNumber, Manufacture manufacture, Engine engine) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
        this.color = color;
        this.price = price;
        this.registrationNumber = registrationNumber;
        this.manufacture = manufacture;
        this.engine = engine;
    }

    int id;
    String make;
    String model;
    int yearOfManufacture;
    String color;
    double price;
    String registrationNumber;

    Manufacture manufacture;
    Engine engine;

    public abstract void showCharacteristics();
}