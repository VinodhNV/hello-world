public class Caterpillar extends Animal implements Walkable, ButterFlyState {

    public void walk(){
        System.out.println("Caterpillar walking");
    }

    public void perform(ButterFlyStateContext butterFlyStateContext){
        this.walk();
    }
}

