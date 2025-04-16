package Models.Polymorphism;

public class Dog extends Animal{

    @Override
    public String makeSound() {
        return "BARK";
    }

    public String makeSound(String s ) {
        return s;
    }
}
