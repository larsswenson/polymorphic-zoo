import java.util.ArrayList;

public class ZooDemo {
    public static void main(String[] args) {
        Animal lion = new Lion("Leo");
        Animal elephant = new Elephant("Horton");
        Animal monkey = new Monkey("George");

        ArrayList<Animal> zoo = new ArrayList<>();
        zoo.add(lion);
        zoo.add(elephant);
        zoo.add(monkey);

        for (Animal animal : zoo) {
            System.out.println(animal.getName() + " says:");
            animal.makeSound();
            System.out.println();
            animal.makeSound(3);
            System.out.println("\n");
        }
    }
}

