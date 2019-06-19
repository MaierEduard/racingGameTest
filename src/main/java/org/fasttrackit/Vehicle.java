package org.fasttrackit;

import java.time.LocalDate;

class Vehicle {

    private String name;
    private String color;
    private double mileage;
    private double fuelLevel;
    private boolean running;
    private LocalDate createdDate;
    private double travelDistance;
    private double maxSpeed;

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

    public int sum(int firstNumber, int secondNumber) {
        int sumNumber = firstNumber + secondNumber;
        return sumNumber;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public double getTravelDistance() {
        return travelDistance;
    }

    public void setTravelDistance(double travelDistance) {
        this.travelDistance = travelDistance;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
