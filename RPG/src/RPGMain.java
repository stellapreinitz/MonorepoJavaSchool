import java.util.ArrayList;

public class RPGMain
{
    static void main(String[] args)
    {
        ArrayList<RPGClass> classList = new ArrayList<>();
        classList.add(new Warrior());
        classList.add(new Hunter());
        classList.add(new Necromancer());

        Character hero = new Character(classList.get(2));
        Character villain = new Character(classList.get(1));
        Character ally = new Character(classList.get(0));

        hero.announce();
        hero.characterAction();
        villain.announce();
        ally.announce();
    }
}
