package models;

public class Manufacture {

    String title;
    String owner;
    String country;

    public Manufacture(String title, String owner, String country) {
        this.title = title;
        this.owner = owner;
        this.country = country;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
