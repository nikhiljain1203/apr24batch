package DesignPatterns.PrototypeAndRegistry;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
    private Map<String, Student> studentMap;

    public StudentRegistry() {
        this.studentMap = new HashMap<>();
    }

    public void addStudent(String key, Student student) {
        studentMap.put(key, student);
    }

    public Student getStudent(String key) {
        Student student = studentMap.get(key);
        return student != null ? student.copy() : null; // Return a copy of the student
    }

    public void removeStudent(String key) {
        studentMap.remove(key);
    }
}
