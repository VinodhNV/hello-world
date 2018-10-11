public class Shark extends Fish implements Swimmable {

    private static final String SHARK_COLOUR = "Grey";
    private static final String SHARK_SIZE = "Large";

    @Override
    public void swim() {
        System.out.println("Shark swimming");
    }

    public Shark() {
        this.colour = SHARK_COLOUR;
        this.size = SHARK_SIZE;
    }

    public void perform(){
        System.out.println("Sharks eat other fishes");
    }

}
