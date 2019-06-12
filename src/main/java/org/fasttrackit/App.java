package org.fasttrackit;


public class App {
    public static void main(String[] args) {

        Engine engine = new Engine();
        engine.manufacure = "BMW";

        Car firstCompetitor = new Car();
        firstCompetitor.name = "Dacia";
        firstCompetitor.doorCount = 4;
        firstCompetitor.color = "black";
        firstCompetitor.mileage=7.5;
        firstCompetitor.engine = engine;
        firstCompetitor.running = true;
        firstCompetitor.fuelLevel = 50;
        double distanceFirstCompetitor = firstCompetitor.accelerate(60, 0.50);

        System.out.println("distance first competitor in App.Main" + distanceFirstCompetitor);


        Car secondCompetitor = new Car();
        secondCompetitor.name = "Skoda";
        secondCompetitor.doorCount = 4;
        secondCompetitor.color = "White";
        secondCompetitor.mileage=7.5;
        secondCompetitor.engine = engine;
        secondCompetitor.running = true;
        firstCompetitor. fuelLevel = 40;
        double distanceSecondCompetitor = secondCompetitor.accelerate(30, 0.8);
        System.out.println("distance second competitor" + distanceSecondCompetitor);

    }
}
