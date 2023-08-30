package Les35_Anonim_Class;

public class Test {
    public static void main(String[] args) {
/*        Animal anim1 = new Animal();
        anim1.eat();

*//*
        otherAnimal otherAnim = new otherAnimal();
        otherAnim.eat();
*//*
        Animal anim2 = new Animal() {
            public void eat() {
                System.out.println("Other Animal is eating");
            }
        };*/
        //anim2.eat();
        AbleToEat ableToeat = new AbleToEat.Animal();

        AbleToEat able2 = new AbleToEat() { //создание анонимного класса на 1 раз
            @Override
            public void eat() {
                System.out.println(".....");
            }
        };

    }
}

interface AbleToEat{
    public void eat();

    class Animal implements AbleToEat{

        @Override
        public void eat() {
            System.out.println("Animal is eating");
        }
    }
}
/*    class Animal {
        public void eat() {
            System.out.println("Animal is eating");
        }
    }*/

/*class otherAnimal extends Animal{
    public void eat(){
        System.out.println("Other Animal is eating");
    }*/
