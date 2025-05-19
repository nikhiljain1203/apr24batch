package DesignPatterns.Factory.Components;

public class AndroidButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering Android Button");
    }

    @Override
    public void onClick() {
        System.out.println("Android Button clicked");
    }
}
