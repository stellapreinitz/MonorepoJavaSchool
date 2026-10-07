public class Player
{
    private int health = 100;

    public void takeDamage(int amount)
    {
        if (amount < 0)
        {
            throw new IllegalArgumentException("Amount must be positive");
        }
        else
        {
            health -= amount;
        }
    }

    public int getHealth()
    {
        return health;
    }
}