
/**
 * Write a description of class Orangutan here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Orangutan extends Zoo
{
    // instance variables - replace the example below with your own
    private boolean isYelling;
    private int numBananas; 
    public Orangutan()
    {
        super();
        isYelling = true;
        numBananas = 0;
    }
    public Orangutan(String initSpecies, boolean initIsYelling, int initBananas)
    {
        super(initSpecies);
        isYelling = initIsYelling;
        numBananas = initBananas;
    }
    @Override
    public String getName()
    {
        return "Rich";
    }
    public void yellAtSomeone()
    {
        System.out.println("I am yelling at someone: " + isYelling);
    }
    public void getBananasEaten()
    {
        System.out.println("I have eaten " + numBananas + " bananas");
    }
    public String toString()
    {
        return super.toString() + "I am a organgutan. I have eaten " + numBananas + " bananas and I am yelling at people: " + isYelling; 
    }
}
