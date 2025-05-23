package DesignPatterns.Decorator;

public class Client {
    public static void main(String[] args) {
        IceCream iceCream = new Cherry(
                                new ChocolateSyrup(
                                    new OrangeCone(
                                        new ChocolateCone()
                                    )
                                )
                            );

        System.out.println("Cost: " + iceCream.getCost());
        System.out.println("Description: " + iceCream.getDesc());
    }
}
