package DesignPatterns.Builder;

public class Student {
    String name;
    String age;
    String batch;
    String address;

//    public Student (String name, String age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public Student (String name, String age, String batch) {
//        this(name, age);
//        this.batch = batch;
//    }
//
//    public Student (String name, String age, String batch, String address) {
//        this(name, age, batch);
//        this.address = address;
//    }
    private Student(Builder builder) {
        this.name = builder.getName();
        this.age = builder.getAge();
        this.batch = builder.getBatch();
        this.address = builder.getAddress();
    }

    public static Builder getBuilder() {
        return new Builder();
    }

    static class Builder {
        private String name;
        private String age;
        private String batch;
        private String address;

        public String getName() {
            return name;
        }

        public String getAge() {
            return age;
        }

        public String getBatch() {
            return batch;
        }

        public String getAddress() {
            return address;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(String age) {
            this.age = age;
            return this;
        }

        public Builder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Student build() {
            // Validations
            if(Integer.parseInt(this.age) < 18) {
                throw new IllegalArgumentException("Age must be 18 or older");
            }
            return new Student(this);
        }
    }
}
