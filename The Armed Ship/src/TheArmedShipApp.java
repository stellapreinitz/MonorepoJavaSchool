public class TheArmedShipApp
{
    static void main(String[] args)
    {
        //Weapon objects created
        Weapon blaster = new Blaster();
        Weapon missile = new Missile();
        Weapon laser = new Laser();

        //Ships created with constructor injection
        Ship hero = new Ship(missile);
        Ship villain = new Ship(blaster);
        //Hardwired ships without injection cannot have different weapons
        HardWiredShip joker = new HardWiredShip();
        HardWiredShip traitor = new HardWiredShip();
        //Ship
        Ship ally = new Ship(null);

        //All ships called to attack
        hero.attack();
        villain.attack();
        joker.attack();
        traitor.attack();
        ally.attack();
    }
}