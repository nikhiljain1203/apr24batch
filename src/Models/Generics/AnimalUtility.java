package Models.Generics;

import java.util.List;

public class AnimalUtility {
    public void <T extends Animal> printAnimalNames(List<? super Animal> animals) {
        for(Object obj : animals) {
            if(obj instanceof Animal) {
                System.out.println(((Animal) obj).getName());
            }
        }

    }
}
