package DesignPatterns.Decorator;

public class Cherry implements IceCream {
    private IceCream iceCream;

    public Cherry(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        return iceCream.getCost() + 5;
    }

    @Override
    public String getDesc() {
        return iceCream.getDesc() + " + Cherry";
    }
}
