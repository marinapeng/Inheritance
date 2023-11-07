public class Zoo
{
    private String species;
    private String name;
    public Zoo()
    {
        species = "";
    }
    public Zoo(String initSpecies)
    {
        species = initSpecies;
    }
    public String getName()
    {
        return "no name yet";
    }
    public String toString()
    {
        return "My name is " + this.getName() + " and I am a " + species + ".\n";
    }
}