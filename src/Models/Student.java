package Models;

public class Student {

    public static String Univ = "Scaler";
    private String name;
    private int id;
    private String email;

    private Batch batch;

    public Batch getBatch() {
        return batch;
    }

    public void setBatch(Batch batch) {
        this.batch = batch;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Constructor is function to create object of class
    public Student() {
        this.name = "Nikhil";
        this.email = "nikhil@scaler.com";
        this.id = 1;
        this.batch = new Batch("APR24");
    }

    public Student(String name, int id, String email) {
        this.name = name;
        this.email = email;
        this.id = id;
    }

    public Student(Student s) {
        this.name = s.name;
        this.email = s.email;
        this.id = s.id;
        this.batch = new Batch(s.batch);
    }

    public static void changeUniName(String name) {
        Univ = name;
    }
}
