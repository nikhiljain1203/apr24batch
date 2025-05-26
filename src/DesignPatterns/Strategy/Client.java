package DesignPatterns.Strategy;

public class Client {
    public static void main(String[] args) {
        PathCalculatorFactory pathCalculatorFactory =
                new PathCalculatorFactory();

        PathCalculatorStrategy pathCalculator =
                pathCalculatorFactory.getPathCalculator("bike");

        String path = pathCalculator.findPath("A", "B");
        System.out.println("Path calculated: " + path);
    }
}
