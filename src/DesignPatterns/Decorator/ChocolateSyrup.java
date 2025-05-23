package DesignPatterns.Decorator;

public class ChocolateSyrup implements IceCream {
    private IceCream iceCream;

    public ChocolateSyrup(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        return iceCream.getCost() + 5;
    }

    @Override
    public String getDesc() {
        return iceCream.getDesc() + " + Chocolate Syrup";
    }
}
