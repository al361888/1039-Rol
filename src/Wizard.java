public class Wizard extends Character {
    public Wizard(String name) {
        super(name);
    }

    @Override
    public CharacterType getType() {
        return CharacterType.WIZARD;
    }
}
