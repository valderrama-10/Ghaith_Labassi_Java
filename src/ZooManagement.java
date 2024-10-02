public class ZooManagement {
    public static void main(String[] args) {
        Animal lion = new Animal("Felidae", "Lion", 5, true);
        Zoo myZoo = new Zoo("Safari Park", "Paris", 10);
        myZoo.addAnimal(lion);
        myZoo.displayZoo();
        System.out.println(myZoo);
        lion.displayAnimal();
        System.out.println(lion);
    }
}
