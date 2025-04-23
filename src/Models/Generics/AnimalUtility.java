package Models.Generics;

import java.util.List;

public class AnimalUtility {
    public <T extends Animal> void printAnimalNames(List<T> animals) {
        for(Object obj : animals) {
            if(obj instanceof Animal) {
                System.out.println(((Animal) obj).getName());
            }
        }

    }
}
