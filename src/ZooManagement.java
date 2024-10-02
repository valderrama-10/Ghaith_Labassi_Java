public class ZooManagement {
    public static void main(String[] args) {
        Animal lion = new Animal("F", "Lion", 5, true);
        Animal tiger = new Animal("F1", "Tiger", 4, true);
        Animal elephant = new Animal("F", "Elephant", 10, true);
        Animal zebra = new Animal("F1", "Zebra", 7, true);

        Zoo myZoo = new Zoo("Safari Park", "Paris");
        Zoo anotherZoo = new Zoo("Wildlife Sanctuary", "London");

        System.out.println("Adding animals to " + myZoo);
        System.out.println(myZoo.addAnimal(lion) ? "Lion added." : "Lion already exists.");
        System.out.println(myZoo.addAnimal(tiger) ? "Tiger added." : "Tiger already exists.");
        System.out.println(myZoo.addAnimal(elephant) ? "Elephant added." : "Elephant already exists.");
        System.out.println(myZoo.addAnimal(zebra) ? "Zebra added." : "Zebra already exists.");

        myZoo.displayZoo();
        myZoo.displayAnimals();

        System.out.println(myZoo.addAnimal(lion) ? "Lion added." : "Lion already exists.");
        System.out.println(myZoo.removeAnimal(elephant) ? "Elephant removed." : "Elephant not found.");
        System.out.println(myZoo.removeAnimal(elephant) ? "Elephant removed." : "Elephant not found.");

        myZoo.displayAnimals();
        System.out.println("Is the zoo full? " + myZoo.isZooFull());

        for (int i = 0; i < 25; i++) {
            Animal animal = new Animal("AnimalType", "Animal" + (i + 1), 3, true);
            System.out.println(anotherZoo.addAnimal(animal) ? "Animal" + (i + 1) + " added to " + anotherZoo : "Could not add Animal" + (i + 1));
        }

        anotherZoo.displayZoo();
        anotherZoo.displayAnimals();

        Zoo largerZoo = Zoo.comparerZoo(myZoo, anotherZoo);
        if (largerZoo != null) {
            System.out.println("The zoo with more animals is: " + largerZoo);
        } else {
            System.out.println("Both zoos have the same number of animals.");
        }
    }
}
