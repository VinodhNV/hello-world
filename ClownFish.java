public class ClownFish extends Fish implements Swimmable {

    private static final String CLOWNNFISH_COLOUR = "Orange";
    private static final String CLOWNFISH_SIZE = "Small";

    @Override
    public void swim() {
        System.out.println("ClownFish swimming");
    }

    public ClownFish() {
        this.colour = CLOWNNFISH_COLOUR;
        this.size = CLOWNFISH_SIZE;
    }

    public void perform(){
        System.out.println("ClownFishes makes jokes");
    }

}
