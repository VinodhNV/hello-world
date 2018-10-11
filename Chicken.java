public class Chicken extends FlightlessBird implements Walkable, Singable {
    @Override
    public void walk() {
        System.out.println("Chicken walking");
    }

    @Override
    public void sing() {
        System.out.println("Cluck, cluck");
    }
}
