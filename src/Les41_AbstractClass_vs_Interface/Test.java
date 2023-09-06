package Les41_AbstractClass_vs_Interface;

public class Test { //разница между абстрактными классами и интерфейсами
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Dog dog1 = new Dog();
        //Animal animal1 = new Animal();
        cat1.makeSound();
        dog1.makeSound();
        cat1.eat();
        dog1.eat();

    }
}
