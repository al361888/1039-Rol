public class Sword implements IWeapon{
    @Override
    public WeaponType getType() {
        return WeaponType.SWORD;
    }

    @Override
    public int weaponDamage() {
        return 15;
    }
}
