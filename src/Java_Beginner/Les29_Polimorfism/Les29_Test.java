package Java_Beginner.Les29_Polimorfism;


public class Les29_Test {
    public static void main(String[] args) {
        Les29_Animal anim1 = new Les29_Animal();
/*        Les29_Dog dog1 = new Les29_Dog();

        anim1.eat();
        dog1.eat();*/

/*        Les29_Animal anim2 = new Les29_Dog();
        anim2.eat();
        Les29_Dog dog2 = new Les29_Dog();
        dog2.Gauu();*/

        Les29_Animal anim3 = new Les29_Dog();
//        anim3.eat();
        Les29_Dog dog3 = new Les29_Dog();
        Cat cat1 = new Cat();

        test(anim1);
        test(dog3);
        test(cat1);
    }

    public static void test(Les29_Animal anim1) {
        anim1.eat();
    }

}
