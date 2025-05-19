package DesignPatterns.Factory.Components;

public class IOSTextField implements TextField {
    @Override
    public void render() {
        System.out.println("Rendering iOS TextField");
    }

    @Override
    public void onChange() {
        System.out.println("iOS TextField input");
    }
}
