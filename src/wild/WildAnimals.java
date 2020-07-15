package wild;
import animals.Animal;

public abstract class WildAnimals extends Animal{
  protected WildAnimals(String name){
    super(name);
  }

  public abstract void tame();


  public void speak() {
    super.speak();
  }
  public abstract void  type();

  public abstract String getName();

}
