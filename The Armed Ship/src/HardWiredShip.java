public class HardWiredShip
{
    //Field declared without constrcutor, no injection
    private Weapon mainGun = new Laser();

    public void attack()
    {
        System.out.println(mainGun.fire());
    }
}