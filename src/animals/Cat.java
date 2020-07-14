package animals;

import wild.WildAnimals;

public class Cat extends WildAnimals implements playable{
    String type="pet";
    String name="";
    int no_of_legs=4;
    public Cat( String catname)
    {
        name=catname;
    }
    public void eat(){
        System.out.println("Am an omnivore");
    }
    public void speak(){
        System.out.println("HI!! AM "+name +"and i have "+no_of_legs);
    }
    public void type(){
        System.out.println(type);
    }
    public void play(){
        String playing="Throw me a ball and i can fetch";
        speak();
        System.out.println(playing);
    }


}
