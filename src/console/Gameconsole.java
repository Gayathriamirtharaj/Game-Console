package console;
import animals.Cat;
import animals.Dog;
import animals.playable;
import musical.Music;

import java.awt.*;
import java.util.*;
import java.util.List;

public class Gameconsole {
    private static List<playable> playableList=new ArrayList<>();
    public static void make_All_play(){
        playableList.forEach((playable) -> playable.play());
    }
    public static void main(String[] args)
    {
        Dog d=new Dog("Scooby");
        Cat c=new Cat("Billy");
         Music m = new Music(new String[]{"alpha.mp3","beta.mp3","gamma.mp3"});
         playableList.add(d);
         playableList.add(c);
         playableList.add(m);
         make_All_play();

    }

}
