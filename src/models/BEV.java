package models;

public class BEV extends Vehicle {
    public BEV(int id, String make, String model, int yearOfManufacture, String color, double price,
            String registrationNumber, Manufacture manufacture, Engine engine) {
        super(id, make, model, yearOfManufacture, color, price, registrationNumber, manufacture, engine);
    }

    public void showCharacteristics() {
        System.out.println("BEV - Characteristics");
    }
}