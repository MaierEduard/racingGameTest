package org.fasttrackit;

import java.time.LocalDate;

public class Vehicle {

    String name;
    String color;
    double mileage;
    double fuelLevel;
    boolean running;
    LocalDate createdDate;
    double travelDistance;
    double maxSpeed;

    public double accelerate(double speed, double durationInHours) {
        System.out.println(name + " is accelerating " + speed + " km/h for " + durationInHours + " h " );
        double distance = speed * durationInHours;

        System.out.println(" Travel " + distance + "km");
        travelDistance += distance;

        System.out.println( "total travel distance" + travelDistance);
        double spentFuel = mileage * 100/ distance;
        System.out.println("spent fuel" + spentFuel);

        fuelLevel -= spentFuel;
        System.out.println("remaining fuel" + fuelLevel);

        return distance;
    }

}
