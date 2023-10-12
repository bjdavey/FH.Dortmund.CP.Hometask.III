package models;

public class Engine {
    public Engine(String maker, int maxRPM, int stroke) {
        this.maker = maker;
        this.maxRPM = maxRPM;
        this.stroke = stroke;
    }

    String maker;
    int maxRPM;
    int stroke;

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public int getMaxRPM() {
        return maxRPM;
    }

    public void setMaxRPM(int maxRPM) {
        this.maxRPM = maxRPM;
    }

    public int getStroke() {
        return stroke;
    }

    public void setStroke(int stroke) {
        this.stroke = stroke;
    }
}
