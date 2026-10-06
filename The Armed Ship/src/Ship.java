public class Ship
{
    //Field decalred
    private final Weapon mainGun;

    //Constructor injects argument
    public Ship(Weapon mainGun)
    {
        //Null guard
        if (mainGun == null)
        {
            this.mainGun = new NoWeapon();
        }
        //Equips Weapon passed to Ship from main
        else
        {
            this.mainGun = mainGun;
        }
    }

    public void attack()
    {
        System.out.println(mainGun.fire());
    }
}