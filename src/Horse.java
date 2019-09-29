public class Horse implements IMount{
    @Override
    public MountType getType() {
        return MountType.HORSE;
    }

    @Override
    public int journeyDuration(int distance) {
        return (int) (distance*0.25);
    }
}
