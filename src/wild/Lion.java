package wild;

public class Lion extends WildAnimals implements wildanimal {
    String type="wild animal";
    int no_of_legs=4;
    String name="";
    public Lion(String lname)
    {
        name=lname;
    }
    public void eat()
    {
        System.out.println("Am an carnivore");
    }
    public void speak(){
        System.out.println("hi am "+name+" "+no_of_legs+"legged lion");
    }
    public void tame(){
        speak();
        eat();
        System.out.println("TAMED:AM "+name+" a wild animal");
    }
    public void type(){
        tame();
        System.out.println(type);
    }



}
