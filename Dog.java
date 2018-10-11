public class Dog extends Animal implements Walkable, Singable{

    @Override
    public void walk() {
        System.out.println("Dog walking");
    }

    @Override
    public void sing() {
        System.out.println("Woof, woof");
    }
}
