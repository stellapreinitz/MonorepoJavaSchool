public class Player
{
    private int health;

    public Player(int health)
    {
        this.health = health;
    }

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