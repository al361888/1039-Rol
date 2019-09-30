public class Mountless implements IMount {
    @Override
    public MountType getType() {
        return MountType.MOUNTLESS;
    }

    @Override
    public int journeyDuration(int distance) {
        return (int) (distance*0.03);
    }
}
