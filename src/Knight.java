public class Knight extends Character {

    public Knight(String name) {
        super(name);
    }

    @Override
    public CharacterType getType() {
        return CharacterType.KNIGHT;
    }
}
