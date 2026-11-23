public class Bulbasaur extends Pokemon
{
    String species = "Bulbasaur";

    public Bulbasaur(String name, int pokedexNumber)
    {
        super(name, "Grass", "Poison", pokedexNumber);
    }

    public String getSpecies()
    {
        return species;
    }

    void talk()
    {
        System.out.println("Bulb!");
    }

    @Override
    void attack()
    {
        System.out.println(this.getName() + " uses vine whip!");
    }
}
