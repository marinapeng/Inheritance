import java.util.ArrayList;

public class ZooDriver
   {
   public static void main( String[] args )
      {
          Zoo zoo = new Zoo ("Salt Lake City Zoo");
          Panda bob = new Panda("panda", false);
          Dolphin dolly = new Dolphin("dolphin", 200);
          Orangutan rich = new Orangutan("orangutan", true, 60);
          System.out.println(bob.getName());
          bob.sleep();
          System.out.println(dolly.getName());
          dolly.blowBubbles();
          System.out.println(rich.getName());
          rich.yellAtSomeone();
          rich.getBananasEaten();

          ZooContainer myZoo = new ZooContainer();
          myZoo.addAnimals(bob);
          myZoo.addAnimals(dolly);
          myZoo.addAnimals(rich);
          myZoo.getAnimal();
        }
    }