package animal;

public class Dog extends Animal{
    public Dog(String nameDog){
        super(nameDog);
    }


    @Override
    public void runAnimal(int length) {
        if(length<501 && length>0){
            System.out.println(super.getName() + " пробежал - " + length + " м.");
        }else if(length>=501 ){
            System.out.println(super.getName() + " устал и не может столько бегать");
        }else{
            System.out.println("Введите корректные данные");
        }
    }

    @Override
    public void swimAnimal(int length) {
        if (length>0 && length<=10) {
            System.out.println(super.getName() + " проплыл - " + length + " м.");
        }else if(length>10){
            System.out.println(super.getName() + " устал и не может столько плыть");
        }else{
            System.out.println("Введите корректные данные");
        }
    }

}
