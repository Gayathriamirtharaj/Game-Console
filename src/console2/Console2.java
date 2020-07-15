package console2;
import animals.Animal;
import wild.Lion;
import wild.Tiger;
import wild.wildanimal;
import animals.Cat;
import animals.Dog;
import animals.playable;
import animals.Animal;
import wild.WildAnimals;
import java.util.*;

public class Console2 {
    private static List<Animal> animalsList = new ArrayList<>();

    public static void tameAll() {
        animalsList.forEach( (animal) -> {
            if(animal instanceof WildAnimals) {
                WildAnimals wildAnimal = (WildAnimals) animal;
                wildAnimal.tame();
            } else {
                System.out.println(animal.getType() + " is NOT a Wild Animal");
            }
        });
    }


  public static void main(String[] args){
    Dog d = new Dog("Scooby");
    Cat c = new Cat("Billy");
    WildAnimals lion = new Lion("Leonard");
    WildAnimals tiger = new Tiger("SherKhan");
    animalsList.add(d);
    animalsList.add(c);
    animalsList.add(lion);
    animalsList.add(tiger);

    tameAll();
}
}
