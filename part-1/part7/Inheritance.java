package part7;

public class Inheritance {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic", "Huge", 50);
        doAnimalStuff(animal, "fast");
        Dog dog = new Dog();
        doAnimalStuff(dog, "fast");
        
        Dog Yorkie = new Dog("Yorkie", 20);
        doAnimalStuff(Yorkie, "slow");
        
        Dog labrador = new Dog("Labrador", 65, "swimmer", "floppy");
        doAnimalStuff(labrador, "slow");
    }

    public static void doAnimalStuff(Animal animal, String speed){
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("-------------------------");
    }
}
