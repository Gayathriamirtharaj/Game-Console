package animals;

import wild.WildAnimals;

public class Dog extends Animal implements playable{
    String type="dog";
    String name="";
    int no_of_legs=4;
    public Dog(String dogname)
    {
        super(dogname);

    }
    public String getName()
    {
        return(this.name);
    }
    public String getType(){return type;}


    public void eat(){
        System.out.println("Am an omnivore");
    }
    public void speak(){
        System.out.println("HI!! AM "+getName()+"and i have "+no_of_legs);
    }
    public void play(){
        getType();
        getName();
        String playing="Throw me a ball and i can fetch";
        speak();
        System.out.println(playing);
    }
    public void type()
    {  play();
        System.out.println(type);}


}