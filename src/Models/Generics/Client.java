package Models.Generics;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List l = new ArrayList();
        l.add(10);
        l.add("Ten");

        Pair p = new Pair();
        p.setFirst(10);
        p.setSecond("Test");

        p.setFirst("Anil");


        GenericPair studentPsp = new GenericPair();
        //studentPsp.setFirst("Vishnu");
        studentPsp.setSecond(99);

        //AnimalUtility.printAnimalNames();


    }

}
