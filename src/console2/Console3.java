package console2;
import animals.Cat;
import animals.Dog;
import animals.Animal;
import wild.WildAnimals;
import wild.Lion;
import wild.Tiger;
import java.util.*;
public class Console3 {
    private static List<Animal> animalList = new ArrayList<>();

    public static void main(String[] args) {

        Dog dog = new Dog("Scooby");
        Cat cat = new Cat("Bella");
        WildAnimals lion = new Lion("Leo");
        WildAnimals tiger = new Tiger("Felix");

        animalList.add(dog);
        animalList.add(cat);
        animalList.add(lion);
        animalList.add(tiger);

        AnimalGame animalGame = new AnimalGame(animalList);

        // Add to Competition
        animalGame.addToSpeakingCompetition(Arrays.asList("Leo", "Bella"));
        animalGame.addToSpeakingCompetition("Felix");

        // Before Competition
        animalGame.printAnimalTypeCountsNotInCompetition();
        // After Competition
        animalGame.printAnimalTypeCountsNotInCompetition();

        // Find with time complexity O(1)
        animalGame.findAnimalByName("Scooby");
        animalGame.findAnimalByName("Cookie");

        // Throw Exception if Animal which is not in the game is added
        animalGame.addToSpeakingCompetition(Arrays.asList("Cookie"));



    }
}