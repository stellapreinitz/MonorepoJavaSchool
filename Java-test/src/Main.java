import java.util.ArrayList;

public class Main
{
    static void main(String[] args)
    {
        Pokemon p1 = new Bulbasaur("Buldi", 1);
        Pokemon p2 = new Pikachu("George", 25);

        ArrayList<Pokemon> pokedex = new ArrayList<>();

        pokedex.add(p1);
        pokedex.add(p2);

        for (Pokemon p : pokedex)
        {
            p.attack();
        }

        for (int index = 0; index < pokedex.size(); index++)
        {
            pokedex.get(index).attack();
        }

        Pokemon currentPokemon = p2;

        System.out.println("Current Pokemon is: " + currentPokemon.toString());

        currentPokemon.attack();
    }
}