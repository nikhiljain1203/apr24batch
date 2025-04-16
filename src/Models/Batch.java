package Models;

public class Batch {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Batch(String name) {
        this.name = name;
    }

    public Batch(Batch b) {
        this.name = b.name;
    }
}
