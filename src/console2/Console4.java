package console2;
import animals.Animal;
import animals.Dog;
import java.util.*;
public class Console4 {
    public static void main(String[] args){
    Runtime runtime = Runtime.getRuntime();

       System.out.println(String.format("Maximum Memory      : %6.2f mb", runtime.maxMemory() / (1024.0 * 1024)));
       System.out.println(String.format("Current used Memory : %6.2f mb", runtime.totalMemory() / (1024.0 * 1024)));
       System.out.println(String.format("Free Memory         : %6.2f mb", runtime.freeMemory() / (1024.0 * 1024)));

       try {
        List<Animal> animalList = new ArrayList<>();

        for (; ; ) {
            Thread.sleep(5);
            animalList.add(new Dog("Scooby"));
        }

    } catch (InterruptedException e) {
        e.printStackTrace();
    }
}
}
