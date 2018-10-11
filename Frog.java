public class Frog extends Animal implements Walkable, Swimmable, Singable{

    @Override
    public void walk() {
        System.out.println("Frog walking");
    }

    @Override
    public void swim() {
        System.out.println("Frog swimming");
    }

    @Override
    public void sing() {
        System.out.println("Croak Croak");
    }

}

