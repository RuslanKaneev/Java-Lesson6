package animal;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Барсик");
        Dog dog = new Dog("Шарик");
        cat.swimAnimal(300);
        cat.swimAnimal(-5);
        cat.runAnimal(100);
        cat.runAnimal(100);
        dog.swimAnimal(5);
        dog.swimAnimal(11);
        dog.runAnimal(100);
        dog.runAnimal(600);
    }
}