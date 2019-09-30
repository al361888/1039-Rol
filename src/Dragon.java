public class Dragon implements IMount {
    @Override
    public MountType getType() {
        return MountType.DRAGON;
    }

    @Override
    public int journeyDuration(int distance) {
        return (int) (distance*0.005);
    }
}
