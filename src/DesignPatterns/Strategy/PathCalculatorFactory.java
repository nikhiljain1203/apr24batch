package DesignPatterns.Strategy;

public class PathCalculatorFactory {
    public PathCalculatorStrategy getPathCalculator(String mode) {
        if (mode.equalsIgnoreCase("car")) {
            return new CarPathCal();
        } else if (mode.equalsIgnoreCase("bike")) {
            return new BikePathCal();
        } else {
            throw new IllegalArgumentException("Unknown mode of transport: " + mode);
        }
    }
}
