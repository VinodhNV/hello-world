public class Butterfly extends FlyingBird implements Flyable, ButterFlyState {

    public void fly(){
        System.out.println("Butterfly flying");
    }

    public void perform(ButterFlyStateContext butterFlyStateContext){
        this.fly();
    }
}
