package DesignPatterns.PrototypeAndRegistry;

import DesignPatterns.PrototypeAndRegistry.Student;

public class Client {
    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();

        Student mar23Student = new Student(1, "John Doe", "20", "A1");
        studentRegistry.addStudent("mar23Student", mar23Student);

        Student mar23StudentCopy = studentRegistry.getStudent("mar23Student");
        mar23StudentCopy.setName("Jane Doe");
        mar23StudentCopy.setAge("21");

        Student apr24Student = new Student(2, "Alice Smith", "22", "B1");
        studentRegistry.addStudent("apr24Student", apr24Student);

        Student apr24StudentCopy = studentRegistry.getStudent("apr24Student");
        apr24StudentCopy.setName("Bob Brown");
        apr24StudentCopy.setAge("23");

        IntelligentStudent intelligentStudent = new IntelligentStudent(3, "Charlie Black", "24", "C1", 130);
        studentRegistry.addStudent("intelligentStudent", intelligentStudent);

        IntelligentStudent intelligentStudentCopy =
                (IntelligentStudent) studentRegistry.getStudent("intelligentStudent");
        intelligentStudentCopy.setName("David White");
        intelligentStudentCopy.setAge("25");
        intelligentStudentCopy.setIq(140);

    }
}
