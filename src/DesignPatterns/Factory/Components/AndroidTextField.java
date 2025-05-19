package DesignPatterns.Factory.Components;

public class AndroidTextField implements TextField {
    @Override
    public void render() {
        System.out.println("Rendering Android TextField");
    }

    @Override
    public void onChange() {
        System.out.println("Android TextField input");
    }
}
