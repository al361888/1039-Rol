public class Soldier extends Character {
    public Soldier(String name) {
        super(name);
    }

    @Override
    public CharacterType getType() {
        return CharacterType.SOLDIER;
    }
}
