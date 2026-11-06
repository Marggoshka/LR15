package org.example;

public class Server extends Computer {
    int rackUnits;

    public Server(String model, int id, int ram, int rackUnits) {
        super(model, id, ram);
        this.rackUnits = rackUnits;
    }

    @Override
    public String toString() {
        return super.toString() + ", высота: " + rackUnits + "U";
    }
}
