
class Animal {
    protected String name;
    protected String species;
    public Animal(String name, String species) {
        this.name = name;
        this.species = species;
    }
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}


class Dog extends Animal {
    private String breed;
    public Dog(String name, String species, String breed) {
        super(name, species);
        this.breed = breed;
    }
    public void makeSound() {
        System.out.println("Bark");
    }
    public String getBreed() {
        return breed;
    }
}


public class Main1 {
    public static void main(String[] args) {
      
        Dog myDog = new Dog("Buddy", "Canine", "Golden Retriever");
        System.out.println("Name: " + myDog.name);
        System.out.println("Species: " + myDog.species);
        System.out.println("Breed: " + myDog.getBreed());
        myDog.makeSound();
    }
}

