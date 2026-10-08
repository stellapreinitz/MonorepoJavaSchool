public class DamageValidatorMain
{
    static void main(String[] args)
    {
        Player hero = new Player(100);
        try
        {
            runLevel(hero);
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }

        System.out.println(hero.getHealth());
    }

    public static void runLevel(Player hero)
    {
        hero.takeDamage(-10);
        hero.takeDamage(30);
    }
}