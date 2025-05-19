package DesignPatterns.Factory.Components;

public class IOSButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering iOS Button");
    }

    @Override
    public void onClick() {
        System.out.println("iOS Button clicked");
    }
}
