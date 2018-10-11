public class Parrot extends FlyingBird implements Walkable, Flyable, Singable {

    private Singable nearByEntity;

    public Parrot(Singable nearByEntity) {
        this.nearByEntity = nearByEntity;
    }

    @Override
    public void fly() {
        System.out.println("Parrot flying");
    }

    @Override
    public void sing() {
        nearByEntity.sing();
    }

    @Override
    public void walk() {

    }

    public Singable getNearByEntity() {
        return nearByEntity;
    }

    public void setNearByEntity(Singable nearByEntity) {
        this.nearByEntity = nearByEntity;
    }
}
