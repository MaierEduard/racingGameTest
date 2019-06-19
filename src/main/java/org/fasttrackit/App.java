package org.fasttrackit;


public class App {


    public double sumNumber(int a, int b,int c ) {
        double sum = (a + b +c)/3;
        System.out.println(sum+ "+++++++++++++++++++");

        return sum;
    }
    
    public static void main(String[] args) {



        Engine engine = new Engine();
        engine.setManufacure("BMW");

        Car firstCompetitor = new Car(engine);
        firstCompetitor.setName("Dacia");
        firstCompetitor.setDoorCount(4);
        firstCompetitor.setColor("black");
        firstCompetitor.setMileage(7.5);
        firstCompetitor.setEngine(engine);
        firstCompetitor.setRunning(true);
        firstCompetitor.setFuelLevel(50);
        double distanceFirstCompetitor = firstCompetitor.accelerate(60, 0.50);

        System.out.println("distance first competitor in App.Main" + distanceFirstCompetitor);


        Car secondCompetitor = new Car( new Engine());
        firstCompetitor.setName("Skoda");
        firstCompetitor.setDoorCount(4);
        firstCompetitor.setColor("White");
        firstCompetitor.setMileage(7.5);
        firstCompetitor.setEngine(engine);
        firstCompetitor.setRunning(true);
        firstCompetitor.setFuelLevel(40);
        double distanceSecondCompetitor = secondCompetitor.accelerate(30, 0.8);
        System.out.println("distance second competitor" + distanceSecondCompetitor);



    }




}
