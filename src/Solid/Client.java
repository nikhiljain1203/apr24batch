package Solid;

public class Client {
    public static void main(String[] args) {
        Bird b = new Penguin();
        b.eat();

        b = new Sparrow();
        b.eat();

    }
}
