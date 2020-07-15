package console2;
import animals.Dog;
import animals.Cat;
import animals.playable;
import wild.WildAnimals;
import animals.Animal;
import wild.Lion;
import wild.Tiger;
import wild.wildanimal;
import java.util.*;
import java.util.stream.Collectors;

public class AnimalGame{
    private final List<Animal> animalList;
    private final List<String> speakingCompetitors;
    private final HashMap<String, WildAnimals> competitors;

     public AnimalGame(List<Animal> animals){
        animalList = animals;
        speakingCompetitors = new ArrayList<>();
        competitors = new HashMap<>();
        printAnimalTypeCountsNotInCompetition();
    }
    void addToSpeakingCompetition(List<String> animal){
        try{
            for (String s : animal) {
                boolean present = false;
                for(Animal value  : animalList){
                    //if (Objects.equals(((Animal)value).getName(), s)) {
                    if (((WildAnimals) value).getName().equals(s)){
                        present = true;
                        speakingCompetitors.add(s);
                        break;
                    }
                }
                if(!present){
                    throw new RuntimeException("Error Caught: Animal not in the competition!");
                }
            }

        }
        catch (RuntimeException e){
            System.out.println(e);
        }
     }
    void addToSpeakingCompetition(String animal){
        try{
            boolean present = false;
            for (Animal value : animalList){

                if (!Objects.equals(((WildAnimals) value).getName(), animal)) {
                } else {
                    present = true;
                    speakingCompetitors.add(animal);
                    break;
                }
            }
            if(!present){
                throw new RuntimeException("Error Caught: Animal not in the competition!");
            }
        }
        catch (RuntimeException e){
            System.out.println("Error Caught:  Animal not included in the game!");
        }

    }
    void printAnimalTypeCountsNotInCompetition(){
        HashSet<String> non_participant = (HashSet<String>) animalList.stream().map(Animal::getName).collect(Collectors.toSet());
        System.out.println( non_participant.removeAll(new HashSet<String>(speakingCompetitors)));
        for(String temp: non_participant){
            if(competitors.containsKey(temp)){
                System.out.println(temp+" the "+competitors.get(temp)+" isn't participating in speaking competition");
            }
        }
    }
    void findAnimalByName(String name){
        if(competitors.containsKey(name)){
            WildAnimals reference = competitors.get(name);
            System.out.println(name+" Found: "+reference.getClass());
        }
        else{
            System.out.println(name+" not found");
        }
    }
}