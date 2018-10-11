public class Cat extends Animal implements Walkable, Singable{

    @Override
    public void walk() {
        System.out.println("Cat walking");
    }

    @Override
    public void sing() {
        System.out.println("Meow");
    }
}
