public class Animal {
    private String family;
    private String name;
    private int age;
    private boolean isMammal;

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    public void displayAnimal() {
        System.out.println("Animal Name: " + name);
        System.out.println("Family: " + family);
        System.out.println("Age: " + age);
        System.out.println("Is Mammal: " + isMammal);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Animal Name: " + name + ", Family: " + family + ", Age: " + age + ", Is Mammal: " + isMammal;
    }
}
