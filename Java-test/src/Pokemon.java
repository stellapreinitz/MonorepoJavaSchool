public abstract class Pokemon
{
    protected String name;
    protected String type1;
    protected String type2;
    protected int pokedexNumber;

    public Pokemon(String name, String type1, String type2, int pokedexNumber)
    {
        this.name = name;
        this.type1 = type1;
        this.type2 = type2;
        this.pokedexNumber = pokedexNumber;
    }

    public String getName()
    {
        return name;
    }

    public String getType1()
    {
        return type1;
    }

    public String getType2()
    {
        return type2;
    }

    public int getPokedexNumber()
    {
        return pokedexNumber;
    }

    abstract void attack();

    @Override
    public String toString()
    {
        return  "Name = " + name +
                ", Type1 = " + type1 +
                ", Type2 = " + type2 +
                ", PokedexNumber = " + pokedexNumber
                ;
    }
}
