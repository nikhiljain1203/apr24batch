package Solid;

public class Sparrow extends Bird implements Flyable{
    @Override
    public void fly() {
        System.out.println("FLY LOW");
    }
}
