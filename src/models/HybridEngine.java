package models;

public class HybridEngine extends Engine {
    public HybridEngine(String maker, int maxRPM, int stroke) {
        super(maker, maxRPM, stroke);
    }

    int numOfCylinders;
    int numOfBatteries;

    public int getNumOfCylinders() {
        return numOfCylinders;
    }

    public void setNumOfCylinders(int numOfCylinders) {
        this.numOfCylinders = numOfCylinders;
    }

    public int getNumOfBatteries() {
        return numOfBatteries;
    }

    public void setNumOfBatteries(int numOfBatteries) {
        this.numOfBatteries = numOfBatteries;
    }
}