public class Duck extends SwimmingBird implements Walkable, Swimmable, Singable {
    @Override
    public void walk() {
        System.out.println("Duck walking");
    }

    @Override
    public void swim() {
        System.out.println("Duck swimming");
    }

    @Override
    public void sing() {
        System.out.println("Quack, quack");
    }

}
