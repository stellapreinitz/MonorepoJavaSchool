public class RPGMain
{
    static void main(String[] args)
    {
        Warrior warrior = new Warrior();
        Mage mage = new Mage();
        Necromancer necromancer = new Necromancer();

        Character hero = new Character(necromancer);
        Character villain = new Character(mage);

        hero.announce();
        hero.characterAction();
        villain.announce();
    }
}
