package wild;
import wild.WildAnimals;

public class Tiger extends WildAnimals implements wildanimal{

    String type="wild";
    int no_of_legs=4;
    String name="";
    public Tiger(String lname)
    {
        super(lname);
    }
    public String getName()
    {
        return(name);
    }
    public String getType(){return type;}


    public void eat()
    {
        System.out.println("Am an carnivore");
    }
    public void speak(){
        System.out.println("hi am "+getName()+" "+no_of_legs+"legged tiger");
    }
    public void tame(){
        speak();
        eat();
        System.out.println("TAMED:"+name);
    }
    public void type()
    {
        System.out.println(type);
    }



}

