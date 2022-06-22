package animal;

public abstract class Animal {

    public Animal(String nameAnimal) {
        name = nameAnimal;
        count++;
        System.out.println("Мы создали животных: "+ count);
    }

    private String name;
    static int count;

    public void runAnimal(int length) {
        System.out.println(this.name + " пробежал - " + length + " м.");
    }

    public void swimAnimal(int length) {
        System.out.println(this.name + " проплыл - " + length + " м.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
