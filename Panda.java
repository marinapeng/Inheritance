public class Panda extends Zoo
{
    // instance variables - replace the example below with your own
    private boolean isSleeping;
    public Panda()
    {
        super();
        isSleeping = false;
    }
    public Panda(String initSpecies, boolean initIsSleeping)
    {
        super(initSpecies);
        isSleeping = initIsSleeping;
    }
    @Override
    public String getName()
    {
        return "Bob";
    }
    public void sleep()
    {
        System.out.println("I am sleeping: " + isSleeping);
    }
    public String toString()
    {
        return super.toString() + "I am a panda and I am sleeping: " + isSleeping;
    }
}
