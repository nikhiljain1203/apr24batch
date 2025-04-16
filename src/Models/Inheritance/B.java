package Models.Inheritance;

public class B extends A{
    String age;

    public B() {
        super("nikhil");
        this.name = "nikhil";
        //System.out.println("Constructor B");
    }

    public void too() {
        this.foo();
    }
}
