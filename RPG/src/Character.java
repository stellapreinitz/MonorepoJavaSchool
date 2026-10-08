public class Character
{
    RPGClass CharacterClass;

    public Character(RPGClass CharacterClass )
    {
        this.CharacterClass = CharacterClass;
    }
    public void announce()
    {
        System.out.println(CharacterClass.describe());
    }
    public void characterAction()
    {
        System.out.println(CharacterClass.castSpell());
    }
}
