package DesignPatterns.Strategy;

public class BikePathCal implements PathCalculatorStrategy {

    @Override
    public String findPath(String source, String destination) {
        // Logic to calculate the path for a bike
        return "Bike path from " + source + " to " + destination;
    }
}
