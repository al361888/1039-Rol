public abstract class Character {
    public String name;
    public IMount mount;
    public IWeapon weapon;

    public Character() {
    }

    public Character(String name) {
        this.name = name;
    }

    public abstract CharacterType getType();

    public void chooseWeapon(IWeapon weapon) {
        this.weapon = weapon;
    }

    public void useWeapon() {
        System.out.println("Weapon: "+ weapon.getType() +". Damage dealt: "+weapon.weaponDamage() + " points.");
    }

    public void chooseMount(IMount mount) {
        this.mount = mount;
    }

    public void useMount(int distance, Direction direction) {
        System.out.println("Using mount: " + mount.getType());
        System.out.println("Direction: " + direction);
        System.out.println("Duration of the journey: " + mount.journeyDuration(distance) + " minutes. ");
    }

    public void info() {
        System.out.println("===============CHARACTER INFO====================");
        System.out.println("Name: " + name);
        System.out.println("Class: "+ getType());
        System.out.println("Weapon: "+ weapon.getType() + ". Weapon damage: "+ weapon.weaponDamage());
        System.out.println("Mount: "+ mount.getType());
        System.out.println("=================================================");
    }

}
