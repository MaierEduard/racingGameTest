package org.fasttrackit;

public class Car extends AutoVehicle {

    private Engine engine;

    public Engine getEngine() {
        return engine;
    }




    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Car(Engine engine) {
        super(engine);
    }
}
