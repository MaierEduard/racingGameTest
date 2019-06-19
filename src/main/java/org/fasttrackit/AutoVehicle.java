package org.fasttrackit;

public class AutoVehicle extends Vehicle {
   private int doorCount;
   private Engine engine;


    public AutoVehicle(Engine engine) {
       this.engine = engine;
    }

    public int getDoorCount() {
        return doorCount;
    }

    public void setDoorCount(int doorCount) {
        this.doorCount = doorCount;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
