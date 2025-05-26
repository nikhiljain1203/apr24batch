package DesignPatterns.Decorator;

public class ChocolateCone implements IceCream {
    IceCream iceCream;

    public ChocolateCone() {
    }

    public ChocolateCone(IceCream iceCream) {
        this.iceCream = iceCream;
    }
    @Override
    public int getCost() {
        if (iceCream != null) {
            return iceCream.getCost() + 10;
        }
        return 10;
    }

    @Override
    public String getDesc() {
        if (iceCream != null) {
            return iceCream.getDesc() + " + Chocolate Cone";
        }
        return "Chocolate Cone";
    }
}
