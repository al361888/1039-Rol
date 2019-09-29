public class Demo {

    public static void main(String[] args) {
        Character will = new Knight("Will, the Brave");
        will.chooseWeapon(new Sword());
        will.chooseMount(new Horse());
        will.info();
        will.useMount(100, Direction.NORTH);
        will.useWeapon();
    }
}
