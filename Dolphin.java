
/**
 * Write a description of class Dolphin here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dolphin extends Zoo
{
    // instance variables - replace the example below with your own
    private int numBubbles;
    public Dolphin()
    {
        super();
        numBubbles = 0;
    }
    public Dolphin(String initSpecies, int initBubbles)
    {
        super(initSpecies);
        numBubbles = initBubbles;
    }
    @Override
    public String getName()
    {
        return "Dolly";
    }
    public void blowBubbles()
    {
        System.out.println("I am blowing " + numBubbles + " bubbles");
    }
    public String toString()
    {
        return super.toString() + "I am a dolphin and can shoot " + numBubbles + " bubbles";
    }
}
