public class Bow implements IWeapon {
    @Override
    public WeaponType getType() {
        return WeaponType.BOW;
    }

    @Override
    public int weaponDamage() {
        return 10;
    }
}
