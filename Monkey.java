public class Monkey extends Animal {
    public Monkey(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.print("Ooh Ooh Aah Aah ");
    }
}

