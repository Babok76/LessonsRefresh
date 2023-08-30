package Les32_Up_Down_Conversion;

public class Test {
    public static void main(String[] args) {
/*        Dog dg1 = new Dog();
        Animal anim1 = new Animal();

        Animal anim2 = new Dog(); //upcasting - восходящее преобразование
        Animal anim3 = dg1; //собака стала животным

        Dog dg2 = (Dog) anim3; //downcasting - нисходящее преобразование
        dg2.gau();*/

        Animal anim4 = new Animal();
        Dog dg3 = (Dog) anim4;
        dg3.gau();
    }
}
