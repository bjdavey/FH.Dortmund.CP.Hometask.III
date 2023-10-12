package models;

public class ElectricEngine extends Engine {
    public ElectricEngine(String maker, int maxRPM, int stroke) {
        super(maker, maxRPM, stroke);
    }

    int numOfBatteries;

    public int getNumOfBatteries() {
        return numOfBatteries;
    }

    public void setNumOfBatteries(int numOfBatteries) {
        this.numOfBatteries = numOfBatteries;
    }
}