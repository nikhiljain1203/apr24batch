package DesignPatterns.Builder;

public class Client {
    public static void main(String[] args) {
        Student.Builder builder = Student.getBuilder()
                                    .setName("John")
                                    .setAge("20")
                                    .setBatch("A1")
                                    .setAddress("123 Main St");

        Student student = builder.build();
    }
}
