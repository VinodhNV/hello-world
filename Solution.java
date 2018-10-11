public class Solution {
    public static void main(String[] args) {
        Animal[] animals = new Animal[]{ new Bird(),
                new Duck(),
                new Chicken(),
                new Rooster(),
                new Parrot(new Dog()),
                new Fish(),
                new Shark(),
                new ClownFish(),
                new Dolphin(),
                new Frog(),
                new Dog(),
                new Butterfly(),
                new Cat()
        };
        Solution solution = new Solution();

        // 1. Can you implement the sing() method for the bird?
        // 2. Now, we have 2 special kinds of birds: the Duck and the Chicken... Can you implement them to make their own special sound?
        // 3. Now how would you model a rooster?
        Singable[] singingAnimals = new Singable[]{ new Duck(), new Chicken(), new Rooster()};
        solution.printAnimalSounds(singingAnimals);

        // 4. Can you model a parrot? We are specifically interested in three parrots, one that lived in a house with dogs one in a house with cats, the other lived on a farm next to the rooster.
        solution.printParrotSounds();

        // B. Model fish as well as other swimming animals
        solution.printFishActivities();

        // D. Model animals that change their behaviour over time
        solution.performMetamorphosis();

        // E. Counting animals
        solution.printAnimalsCount(animals);

    }

    public void printAnimalSounds(Singable[] singingAnimals){
        System.out.println("-------- Printing singing animal sounds -------- ");
        for (Singable singingAnimal: singingAnimals){
            singingAnimal.sing();
        }
        System.out.println("-------- Printed singing animal sounds -------- ");
    }

    public void printParrotSounds(){
        System.out.println("-------- Printing parrot sounds -------- ");
        Parrot parrotNearDog = new Parrot(new Dog());
        Parrot parrotNearCat = new Parrot(new Cat());
        Parrot parrotNearRooster = new Parrot(new Rooster());

        Parrot[] parrots = new Parrot[]{ parrotNearDog, parrotNearCat, parrotNearRooster};
        for (Parrot parrot: parrots){
            parrot.sing();
        }
        System.out.println("-------- Printed parrot sounds -------- ");
    }

    public void printFishActivities(){
        System.out.println("-------- Printing fish activities -------- ");
        Fish shark = new Shark();
        Fish clownFish = new ClownFish();

        Fish[] fishes = new Fish[]{ shark, clownFish};

        for (Fish fish: fishes){
            fish.perform();
        }
        System.out.println("-------- Printed fish activities -------- ");
    }
    
    private void performMetamorphosis() {
        System.out.println("-------- Performing metamorphosis -------- ");
        ButterFlyStateContext stateContext = new ButterFlyStateContext();
        stateContext.perform();
        stateContext.metamorphosis();
        stateContext.perform();
        System.out.println("-------- Performed metamorphosis -------- ");
    }

    public void printAnimalsCount(Animal[] animals){
        int flyingAnimals = 0, walkingAnimals = 0, swimmingAnimals = 0, singingAnimals = 0;
        for (Animal animal: animals){
            if(animal instanceof Flyable)
                flyingAnimals++;
            if (animal instanceof Walkable)
                walkingAnimals++;
            if (animal instanceof Swimmable)
                swimmingAnimals++;
            if (animal instanceof Singable)
                singingAnimals++;
        }
        System.out.println("-------- Printing Count of Animals -------- ");
        System.out.println("Number of Flying Animals = " + flyingAnimals);
        System.out.println("Number of Walking Animals = " + walkingAnimals);
        System.out.println("Number of Swimming Animals = " + swimmingAnimals);
        System.out.println("Number of Singing Animals = " + singingAnimals);
        System.out.println("-------- Printed Count of Animals -------- ");

    }
}
