package DesignPatterns.PrototypeAndRegistry;

public class IntelligentStudent extends Student{
    private int iq;

    public IntelligentStudent(int id, String name, String age, String batch, int iq) {
        super(id, name, age, batch);
        this.iq = iq;
    }

    public IntelligentStudent(IntelligentStudent intelligentStudent) {
        super(intelligentStudent);
        this.iq = intelligentStudent.iq;
    }

    public IntelligentStudent() {
        this.iq = 50;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }
    @Override
    public IntelligentStudent copy() {
        return new IntelligentStudent(this);
    }
}
