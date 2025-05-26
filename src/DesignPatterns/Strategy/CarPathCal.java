package DesignPatterns.Strategy;

public class CarPathCal implements PathCalculatorStrategy {

    @Override
    public String findPath(String source, String destination) {
        // Logic to calculate the path for a car
        return "Car path from " + source + " to " + destination;
    }
}
