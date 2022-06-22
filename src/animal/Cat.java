package animal;

public class Cat extends Animal{

    public Cat(String nameCat){
        super(nameCat);
    }
    @Override
    public void swimAnimal(int length) {
        System.out.println(super.getName() + " не умеет плавать");
    }

    @Override
    public void runAnimal(int length) {
        if(length<=200 && length>0){
            System.out.println(super.getName() + " пробежал - " + length + " м.");
        }else if(length>200){
            System.out.println(super.getName() + " устал и не может столько бегать");
        }else{
            System.out.println("Введите корректные данные");
        }
    }

}
