package console2;
import wild.Lion;
import wild.Tiger;
import wild.wildanimal;
import animals.Cat;
import animals.Dog;
import animals.playable;
import wild.WildAnimals;
import java.util.*;

public class Console2 {
    private static List<WildAnimals> animalsList = new ArrayList<>();

    public static void tameAll() {
         animalsList.forEach(WildAnimals::type);}

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
