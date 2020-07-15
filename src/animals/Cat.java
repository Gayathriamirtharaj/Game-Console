package animals;

import wild.WildAnimals;

public class Cat extends Animal implements playable{
    String type="pet";
    String name="";
    int no_of_legs=4;
    public Cat( String catname)
    {
        super(catname);
    }
    public String getName()
    {
        return(name);
    }

    public void eat(){
        System.out.println("Am an omnivore");
    }
    public void speak(){
        System.out.println("HI!! AM "+getName() +"and i have "+no_of_legs);
    }
    public String getType(){
        return(type);
    }
    public void play(){
        String playing="Throw me a ball and i can fetch";
        speak();
        System.out.println(playing);
    }


}
