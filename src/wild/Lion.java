package wild;

import animals.Animal;
import wild.WildAnimals;

public class Lion extends WildAnimals implements wildanimal {
    String type="wild animal";
    int no_of_legs=4;
    String name="";
    public Lion(String lname)
    {
        super(lname);
    }
    public String getName()
    {
        return(name);
    }
    public void type(){System.out.print(type);}
    public void eat()
    {
        System.out.println("Am an carnivore");
    }
    public void speak(){
        System.out.println("hi am "+getName()+" "+no_of_legs+"legged lion");
    }
    public void tame(){
        speak();
        eat();
        System.out.println("TAMED:AM "+name+" a wild animal");
    }
    public String getType(){
        return type;
    }



}
