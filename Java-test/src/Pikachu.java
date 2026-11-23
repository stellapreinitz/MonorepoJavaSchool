public class Pikachu extends Pokemon
{
    String species = "Pikachu";

    public Pikachu(String name, int pokedexNumber)
    {
        super(name, "Electric", null, pokedexNumber);
    }

    public String getSpecies()
    {
        return species;
    }

    @Override
    void attack()
    {
        System.out.println(this.name + " uses thunderbolt!");
    }
}
