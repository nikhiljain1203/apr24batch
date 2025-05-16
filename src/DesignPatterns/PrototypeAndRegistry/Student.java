package DesignPatterns.PrototypeAndRegistry;

public class Student implements Prototype<Student>{
    private int id;
    private String name;
    private String age;
    private String batch;

    public Student(int id, String name, String age, String batch) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.batch = batch;
    }

    public Student() {

    }

    public Student(Student student) {
        this.id = student.id;
        this.name = student.name;
        this.age = student.age;
        this.batch = student.batch;
    }

    @Override
    public Student copy() {
        return new Student(this);
    }


//    @Override
//    public Student clone() {
//        try {
//            Student clone = (Student) super.clone();
//            // TODO: copy mutable state here, so the clone can't change the internals of the original
//            return clone;
//        } catch (CloneNotSupportedException e) {
//            throw new AssertionError();
//        }
//    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }
}
