package models;

public class CombustionEngine extends Engine {
    public CombustionEngine(String maker, int maxRPM, int stroke) {
        super(maker, maxRPM, stroke);
    }

    int numOfCylinders;

    public int getNumOfCylinders() {
        return numOfCylinders;
    }

    public void setNumOfCylinders(int numOfCylinders) {
        this.numOfCylinders = numOfCylinders;
    }
}