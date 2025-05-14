//package DesignPatterns.Builder;
//
//public class Builder {
//    private String name;
//    private String age;
//    private String batch;
//    private String address;
//
//    public String getName() {
//        return name;
//    }
//
//    public String getAge() {
//        return age;
//    }
//
//    public String getBatch() {
//        return batch;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public Builder setName(String name) {
//        this.name = name;
//        return this;
//    }
//
//    public Builder setAge(String age) {
//        this.age = age;
//        return this;
//    }
//
//    public Builder setBatch(String batch) {
//        this.batch = batch;
//        return this;
//    }
//
//    public Builder setAddress(String address) {
//        this.address = address;
//        return this;
//    }
//
//    public Student build() {
//        // Validations
//        if(Integer.parseInt(this.age) < 18) {
//            throw new IllegalArgumentException("Age must be 18 or older");
//        }
//        return new Student(this);
//    }
//}
