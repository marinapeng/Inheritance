import java.util.ArrayList;
public class ZooContainer
{
    // instance variables - replace the example below with your own
    private ArrayList<Zoo> zoo;
    public ZooContainer()
    {
        zoo = new ArrayList<>();
    }
    public void addAnimals(Zoo newAnimal)
    {
        zoo.add(newAnimal);
    }
    public void removeAnimals (Zoo newAnimal)
    {
        zoo.remove(newAnimal);
    }
    public void getAnimal()
    {
        for(int i=0; i<zoo.size(); i++)
            {
                System.out.println(zoo.get(i).getName());
                System.out.println(zoo.get(i));
            }
    }
}
